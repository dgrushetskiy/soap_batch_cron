package ru.mos.ugd.bus.gisrenupdate.batch;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import ru.mos.ugd.bus.gisrenupdate.batch.process.InputMrProcessor;
import ru.mos.ugd.bus.gisrenupdate.batch.process.InputProcess;
import ru.mos.ugd.bus.gisrenupdate.batch.process.InputProcessMin;
import ru.mos.ugd.bus.gisrenupdate.batch.process.InputSnosKvartProcessor;
import ru.mos.ugd.bus.gisrenupdate.batch.steps.DataLogBatchStep;
import ru.mos.ugd.bus.gisrenupdate.config.DataSourceConfiguration;
import ru.mos.ugd.bus.gisrenupdate.model.DataLog;

import javax.sql.DataSource;

@Configuration
@EnableBatchProcessing
@Import(DataSourceConfiguration.class)
@ComponentScan(basePackageClasses = DataSourceConfiguration.class)
public class Batch {

    @Autowired
    @Qualifier("dataSource")
    public DataSource dataSource;

    @Autowired
    @Qualifier("secondaryDataSource")
    public DataSource secondaryDataSource;

    @Bean
    public InputProcess processor() {
        return new InputProcess();
    }

    @Bean
    public InputProcessMin processMin() {
        return new InputProcessMin();
    }
    @Bean
    public InputMrProcessor inputMrProcessor(){
        return new InputMrProcessor();
    }

    public InputSnosKvartProcessor inputSnosKvartProcessor(){
        return new InputSnosKvartProcessor();
    }

    @Bean
    Job job(JobBuilderFactory jbc, StepBuilderFactory sbf, DataLogBatchStep step1) {
        Step s1 = sbf.get("db-xml").<DataLog, DataLog>chunk(100)
               // .reader(step1.jdbcReader(dataSource)).processor(processor())
                .reader(step1.tableReader(dataSource))//.processor(processMin())////.processor(inputSnosKvartProcessor())//
                .writer(step1.writer())
                .build();
        return jbc.get("dataMigration from oneDb->dataLogMin").incrementer(new RunIdIncrementer()).start(s1).build();
    }


}

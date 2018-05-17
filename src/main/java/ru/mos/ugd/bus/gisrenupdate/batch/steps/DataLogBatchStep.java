package ru.mos.ugd.bus.gisrenupdate.batch.steps;

import org.springframework.batch.core.repository.JobRepository;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.database.JdbcCursorItemReader;
import org.springframework.batch.item.xml.StaxEventItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.FileSystemResource;
import org.springframework.oxm.xstream.XStreamMarshaller;
import ru.mos.ugd.bus.gisrenupdate.model.DataLog;
import ru.mos.ugd.bus.gisrenupdate.model.DataLogMin;
import ru.mos.ugd.bus.gisrenupdate.model.maper.DataLogMinRowMapper;
import ru.mos.ugd.bus.gisrenupdate.model.maper.DataLogRowMapper;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

@Configuration
public class DataLogBatchStep {
    @Autowired
    JobRepository jobRepository;

    @Bean
    public ItemReader jdbcReader(DataSource dataSource) {
        String sql = "SELECT operation,update_time,table_name,rowid,user_login,user_name, user_ip,application_name,application_version,new_value,old_value FROM renovastorage.data_log";
        JdbcCursorItemReader<DataLog> jdbcCursorItemReader = new JdbcCursorItemReader<>();
        jdbcCursorItemReader.setDataSource(dataSource);
        jdbcCursorItemReader.setSql(sql);
        jdbcCursorItemReader.setVerifyCursorPosition(false);
        jdbcCursorItemReader.setRowMapper(new DataLogRowMapper());
        return jdbcCursorItemReader;
    }

    @Bean
    public ItemReader tableReader(DataSource dataSource) {
        String sql = "SELECT operation,table_name, new_value FROM renovastorage.data_log";
        JdbcCursorItemReader<DataLogMin> jdbcCursorItemReader = new JdbcCursorItemReader<>();
        jdbcCursorItemReader.setDataSource(dataSource);
        jdbcCursorItemReader.setSql(sql);
        jdbcCursorItemReader.setVerifyCursorPosition(false);
        jdbcCursorItemReader.setRowMapper(new DataLogMinRowMapper());
        return jdbcCursorItemReader;
    }

//    @Bean
//    public ItemWriter itemWriter(){
//        return new ItemWriterAdapter();
//    }

    @Bean
    public StaxEventItemWriter<DataLogMin> writer() {
        StaxEventItemWriter<DataLogMin> writer = new StaxEventItemWriter<>();
        writer.setResource(new FileSystemResource("xsd_common/dataLogMin.xml"));
        writer.setMarshaller(dataLogMinUnmarshaller());
        writer.setRootTagName("datalogs");
        return writer;
    }

    @Bean
    public XStreamMarshaller dataLogMinUnmarshaller() {
        XStreamMarshaller unMarshaller = new XStreamMarshaller();
        Map<String, Class> aliases = new HashMap<String, Class>();
        aliases.put("dataLogMin", DataLogMin.class);
        unMarshaller.setAliases(aliases);
        return unMarshaller;
    }
}

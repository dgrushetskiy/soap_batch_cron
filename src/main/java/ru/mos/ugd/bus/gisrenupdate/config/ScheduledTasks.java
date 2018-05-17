package ru.mos.ugd.bus.gisrenupdate.config;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import ru.mos.ugd.bus.gisrenupdate.service.DataLogService;

import java.util.Date;

@Component
@EnableScheduling
public class ScheduledTasks {

    @Autowired
    JobLauncher jobLauncher;

    @Autowired
    Job job;
    @Autowired
    private DataLogService dataLogService;

    @Scheduled(cron = "*/50 * * * * *")//0 0/30 * * * TUE-SAT
    public void runJob() throws Exception {
        Integer countFrom = dataLogService.countRowFromDataLog();
        int fromCount = countFrom.intValue();
        System.out.println("fromCount = " + fromCount);
        System.out.println("процесс старт");
        JobParametersBuilder builder = new JobParametersBuilder();
        builder.addDate("date", new Date());
        jobLauncher.run(job, builder.toJobParameters());
        System.out.println("процесс стоп");
    }
}

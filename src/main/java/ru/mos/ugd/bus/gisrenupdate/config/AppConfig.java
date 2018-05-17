package ru.mos.ugd.bus.gisrenupdate.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.mos.ugd.bus.gisrenupdate.dao.DataLogDao;
import ru.mos.ugd.bus.gisrenupdate.dao.impl.DataLogDaoImpl;

@Configuration
public class AppConfig {
    @Bean
    public DataLogDao dataLogDao() {
        return new DataLogDaoImpl();
    }
}

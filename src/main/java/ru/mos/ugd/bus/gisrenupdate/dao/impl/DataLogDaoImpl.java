package ru.mos.ugd.bus.gisrenupdate.dao.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import ru.mos.ugd.bus.gisrenupdate.dao.DataLogDao;

public class DataLogDaoImpl implements DataLogDao {

    private static final Logger log = LoggerFactory.getLogger(DataLogDaoImpl.class);

    @Autowired
    @Qualifier("jdbcTemplateFrom")
    private JdbcTemplate jdbcTemplateFrom;
    @Autowired
    @Qualifier("jdbcTemplateTo")
    private JdbcTemplate jdbcTemplateTo;

    @Override
    public Integer countRowFromDataLog() {
        String sql = "SELECT count(*) FROM renovastorage.data_log";
        int totalRow = jdbcTemplateFrom.queryForObject(sql, Integer.class);
        return totalRow;
    }

    @Override
    public Integer countRowToDataLog() {
        String sql = "SELECT count(*) FROM renovastorage.data_log";
        int totalRow = jdbcTemplateTo.queryForObject(sql, Integer.class);
        return totalRow;
    }
}

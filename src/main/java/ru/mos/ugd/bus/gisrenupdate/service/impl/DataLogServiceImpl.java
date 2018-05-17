package ru.mos.ugd.bus.gisrenupdate.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.mos.ugd.bus.gisrenupdate.dao.DataLogDao;
import ru.mos.ugd.bus.gisrenupdate.service.DataLogService;

@Service("dataLogService")
public class DataLogServiceImpl implements DataLogService {
    @Autowired
    private DataLogDao dataLogDao;


    @Override
    public Integer countRowFromDataLog() {
        return dataLogDao.countRowFromDataLog();
    }

    @Override
    public Integer countRowToDataLog() {
        return dataLogDao.countRowToDataLog();
    }
}

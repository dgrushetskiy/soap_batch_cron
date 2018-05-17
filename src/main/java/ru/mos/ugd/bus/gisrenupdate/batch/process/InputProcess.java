package ru.mos.ugd.bus.gisrenupdate.batch.process;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import ru.mos.ugd.bus.gisrenupdate.model.DataLog;
import ru.mos.ugd.bus.gisrenupdate.utils.ConverterObjectUtil;

public class InputProcess implements ItemProcessor<DataLog, DataLog> {

    private static final Logger logger = LoggerFactory.getLogger(InputProcess.class);
    @Autowired
    private ConverterObjectUtil converterObjectUtil;

    @Override
    public DataLog process(DataLog dataLog) throws Exception {
        logger.info("Proses input : {}", dataLog);
        DataLog output = new DataLog();
        output.setOperation(dataLog.getOperation());
        output.setUpdateTime(dataLog.getUpdateTime());
        output.setTableName(dataLog.getTableName());
        //  System.out.println(output.getTableName());
        output.setRowId(dataLog.getRowId());
        output.setUserLogin(dataLog.getUserLogin());
        output.setUserName(dataLog.getUserName());
        output.setUserIp(dataLog.getUserIp());
        output.setApplicationName(dataLog.getApplicationName());
        output.setApplicationVersion(dataLog.getApplicationVersion());
        output.setJsonNewObject(dataLog.getJsonNewObject());
        //   System.out.println(output.getJsonNewObject());
        output.setJsonOldObject(dataLog.getJsonOldObject());
//        String tableName = output.getTableName();
//        System.out.println("tableName " + tableName);
//        String jsonObject = output.getJsonNewObject();
//        System.out.println("jsonObject " + jsonObject);
//        System.out.println("test convert запущен");
//        ConverterObjectUtil converterObjectUtil = new ConverterObjectUtil();
//        converterObjectUtil.doSelectTable(tableName,jsonObject);
//
//        System.out.println("test convert прошел!");
        logger.info("ввод данных произведен: {}", output);
        return output;
    }

    private String tableName(String tableName) {
        return tableName;
    }


}

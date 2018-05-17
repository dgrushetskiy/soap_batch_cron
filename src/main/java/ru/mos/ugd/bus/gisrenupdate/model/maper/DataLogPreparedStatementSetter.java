package ru.mos.ugd.bus.gisrenupdate.model.maper;

import org.springframework.batch.item.database.ItemPreparedStatementSetter;
import ru.mos.ugd.bus.gisrenupdate.model.DataLog;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DataLogPreparedStatementSetter implements ItemPreparedStatementSetter<DataLog> {

    public DataLogPreparedStatementSetter() {
    }

    @Override
    public void setValues(DataLog dataLog, PreparedStatement ps) throws SQLException {
        ps.setString(1, dataLog.getOperation());
        ps.setObject(2, dataLog.getUpdateTime());
        ps.setString(3, dataLog.getTableName());
        ps.setLong(4, dataLog.getRowId());
        ps.setString(5, dataLog.getUserLogin());
        ps.setString(6, dataLog.getUserName());
        ps.setString(7, dataLog.getUserIp());
        ps.setString(8, dataLog.getApplicationName());
        ps.setString(9, dataLog.getApplicationVersion());
        ps.setString(10, dataLog.getJsonNewObject());
        ps.setString(11, dataLog.getJsonOldObject());
    }
}

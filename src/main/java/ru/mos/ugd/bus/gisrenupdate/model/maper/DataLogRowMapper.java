package ru.mos.ugd.bus.gisrenupdate.model.maper;

import org.springframework.jdbc.core.RowMapper;
import ru.mos.ugd.bus.gisrenupdate.model.DataLog;

import java.sql.ResultSet;
import java.sql.SQLException;


public class DataLogRowMapper implements RowMapper<DataLog> {

    @Override
    public DataLog mapRow(ResultSet rs, int rowNum) throws SQLException {
        DataLog dataLog = new DataLog();
        dataLog.setOperation(rs.getString("operation"));
        dataLog.setUpdateTime(rs.getDate("update_time"));
        dataLog.setTableName(rs.getString("table_name"));
        dataLog.setRowId(rs.getLong("rowid"));
        dataLog.setUserLogin(rs.getString("user_login"));
        dataLog.setUserName(rs.getString("user_name"));
        dataLog.setUserIp(rs.getString("user_ip"));
        dataLog.setApplicationName(rs.getString("application_name"));
        dataLog.setApplicationVersion(rs.getString("application_version"));
        dataLog.setJsonNewObject(rs.getString("new_value"));
        dataLog.setJsonOldObject(rs.getString("old_value"));
        return dataLog;
    }
}

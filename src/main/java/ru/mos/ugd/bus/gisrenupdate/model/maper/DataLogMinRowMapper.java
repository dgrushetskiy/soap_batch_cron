package ru.mos.ugd.bus.gisrenupdate.model.maper;

import org.springframework.jdbc.core.RowMapper;
import ru.mos.ugd.bus.gisrenupdate.model.DataLogMin;

import java.sql.ResultSet;
import java.sql.SQLException;

public class DataLogMinRowMapper implements RowMapper<DataLogMin> {
    @Override
    public DataLogMin mapRow(ResultSet rs, int rowNum) throws SQLException {
        DataLogMin dataLog = new DataLogMin();
        dataLog.setOperation(rs.getString("operation"));
        dataLog.setTableName(rs.getString("table_name"));
        dataLog.setJsonNewObject(rs.getString("new_value"));
        return dataLog;
    }
}

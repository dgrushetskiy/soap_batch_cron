package ru.mos.ugd.bus.gisrenupdate.utils.impl.json;

import com.fasterxml.jackson.databind.ObjectMapper;
import ru.mos.ugd.bus.gisrenupdate.model.json.Mr;
import ru.mos.ugd.bus.gisrenupdate.utils.UtilObject;
import ru.mos.ugd.bus.gisrenupdate.utils.impl.TableName;

import java.io.IOException;

public class JsonToMr implements UtilObject<Mr> {

    @Override
    public Mr stringToObject(String tableName) {
        if (tableName.equals(TableName.MR)) {
            return new Mr();
        } else {
            return null;
        }
    }

    @Override
    public Mr jsonToObject(String jsonObject) {
        ObjectMapper objectMapper = new ObjectMapper();
        Mr mr = new Mr();
        if (jsonObject != null) {
            try {
                mr = objectMapper.readValue(jsonObject, Mr.class);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return mr;
    }
}

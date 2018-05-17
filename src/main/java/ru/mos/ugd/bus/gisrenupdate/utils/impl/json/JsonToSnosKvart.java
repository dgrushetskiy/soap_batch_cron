package ru.mos.ugd.bus.gisrenupdate.utils.impl.json;

import com.fasterxml.jackson.databind.ObjectMapper;
import ru.mos.ugd.bus.gisrenupdate.model.json.SnosKvart;
import ru.mos.ugd.bus.gisrenupdate.utils.UtilObject;
import ru.mos.ugd.bus.gisrenupdate.utils.impl.TableName;

import java.io.IOException;

public class JsonToSnosKvart implements UtilObject<SnosKvart> {
    @Override
    public SnosKvart stringToObject(String tableName) {
        if (tableName.equals(TableName.SNOS_KVART)) {
            return new SnosKvart();
        } else {
            return null;
        }
    }

    @Override
    public SnosKvart jsonToObject(String jsonObject) {
        ObjectMapper objectMapper = new ObjectMapper();
        SnosKvart snosKvart = new SnosKvart();
        if (jsonObject != null) {
            try {
                snosKvart = objectMapper.readValue(jsonObject, SnosKvart.class);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return snosKvart;
    }
}

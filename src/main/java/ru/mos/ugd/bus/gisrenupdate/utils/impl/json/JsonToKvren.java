package ru.mos.ugd.bus.gisrenupdate.utils.impl.json;

import com.fasterxml.jackson.databind.ObjectMapper;
import ru.mos.ugd.bus.gisrenupdate.model.json.Kvren;
import ru.mos.ugd.bus.gisrenupdate.utils.UtilObject;
import ru.mos.ugd.bus.gisrenupdate.utils.impl.TableName;

import java.io.IOException;

public class JsonToKvren implements UtilObject<Kvren> {
    @Override
    public Kvren stringToObject(String tableName) {
        if (tableName.equals(TableName.KVREN)) {
            return new Kvren();
        } else {
            return null;
        }
    }

    @Override
    public Kvren jsonToObject(String jsonObject) {
        ObjectMapper objectMapper = new ObjectMapper();
        Kvren kvren = new Kvren();
        if (jsonObject != null) {
            try {
                kvren = objectMapper.readValue(jsonObject, Kvren.class);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return kvren;
    }
}

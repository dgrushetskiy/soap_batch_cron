package ru.mos.ugd.bus.gisrenupdate.utils.impl.json;

import com.fasterxml.jackson.databind.ObjectMapper;
import ru.mos.ugd.bus.gisrenupdate.model.json.Snos;
import ru.mos.ugd.bus.gisrenupdate.utils.UtilObject;
import ru.mos.ugd.bus.gisrenupdate.utils.impl.TableName;

import java.io.IOException;

public class JsonToSnos implements UtilObject<Snos> {

    @Override
    public Snos stringToObject(String tableName) {
        if (tableName.equals(TableName.SNOS)) {
            return new Snos();
        } else {
            return null;
        }
    }

    @Override
    public Snos jsonToObject(String jsonObject) {
        ObjectMapper objectMapper = new ObjectMapper();
        Snos snos = new Snos();
        if (jsonObject != null) {
            try {
                snos = objectMapper.readValue(jsonObject, Snos.class);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return snos;
    }
}

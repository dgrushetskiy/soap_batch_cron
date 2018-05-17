package ru.mos.ugd.bus.gisrenupdate.utils.impl.json;

import com.fasterxml.jackson.databind.ObjectMapper;
import ru.mos.ugd.bus.gisrenupdate.model.json.StartKvartirVariant;
import ru.mos.ugd.bus.gisrenupdate.utils.UtilObject;
import ru.mos.ugd.bus.gisrenupdate.utils.impl.TableName;

import java.io.IOException;

public class JsonToStartKvartirVariant implements UtilObject<StartKvartirVariant> {
    @Override
    public StartKvartirVariant stringToObject(String tableName) {
        if (tableName.equals(TableName.START_KVARTIR_VARIANT)) {
            return new StartKvartirVariant();
        } else {
            return null;
        }
    }

    @Override
    public StartKvartirVariant jsonToObject(String jsonObject) {
        ObjectMapper objectMapper = new ObjectMapper();
        StartKvartirVariant startKvartirVariant = new StartKvartirVariant();
        if (jsonObject != null) {
            try {
                startKvartirVariant = objectMapper.readValue(jsonObject, StartKvartirVariant.class);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return startKvartirVariant;
    }
}

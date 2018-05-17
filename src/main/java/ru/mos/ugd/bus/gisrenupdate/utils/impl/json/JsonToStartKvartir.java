package ru.mos.ugd.bus.gisrenupdate.utils.impl.json;

import com.fasterxml.jackson.databind.ObjectMapper;
import ru.mos.ugd.bus.gisrenupdate.model.json.StartKvartir;
import ru.mos.ugd.bus.gisrenupdate.utils.UtilObject;
import ru.mos.ugd.bus.gisrenupdate.utils.impl.TableName;

import java.io.IOException;

public class JsonToStartKvartir implements UtilObject<StartKvartir> {
    @Override
    public StartKvartir stringToObject(String tableName) {
        if (tableName.equals(TableName.START_KVARTIR)) {
            return new StartKvartir();
        } else {
            return null;
        }
    }

    @Override
    public StartKvartir jsonToObject(String jsonObject) {
        ObjectMapper objectMapper = new ObjectMapper();
        StartKvartir startKvartir = new StartKvartir();
        if (jsonObject != null) {
            try {
                startKvartir = objectMapper.readValue(jsonObject, StartKvartir.class);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return startKvartir;
    }
}

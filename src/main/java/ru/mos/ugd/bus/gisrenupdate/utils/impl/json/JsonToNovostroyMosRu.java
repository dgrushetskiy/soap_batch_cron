package ru.mos.ugd.bus.gisrenupdate.utils.impl.json;

import com.fasterxml.jackson.databind.ObjectMapper;
import ru.mos.ugd.bus.gisrenupdate.model.json.NovostroyMosRu;
import ru.mos.ugd.bus.gisrenupdate.utils.UtilObject;
import ru.mos.ugd.bus.gisrenupdate.utils.impl.TableName;

import java.io.IOException;

public class JsonToNovostroyMosRu implements UtilObject<NovostroyMosRu> {
    @Override
    public NovostroyMosRu stringToObject(String tableName) {
        if (tableName.equals(TableName.NOVOSTROY_MOS_RU)) {
            return new NovostroyMosRu();
        } else {
            return null;
        }
    }

    @Override
    public NovostroyMosRu jsonToObject(String jsonObject) {
        ObjectMapper objectMapper = new ObjectMapper();
        NovostroyMosRu novostroyMosRu = new NovostroyMosRu();
        if (jsonObject != null) {
            try {
                novostroyMosRu = objectMapper.readValue(jsonObject, NovostroyMosRu.class);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return novostroyMosRu;
    }
}

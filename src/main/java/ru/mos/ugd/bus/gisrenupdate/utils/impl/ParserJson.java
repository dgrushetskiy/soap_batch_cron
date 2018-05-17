package ru.mos.ugd.bus.gisrenupdate.utils.impl;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ParserJson {

    public Map parserJson(String json){
        ObjectMapper objectMapper = new ObjectMapper();
        Map<String, String> map = new HashMap<>();

        try {
            try {
                map = objectMapper.readValue(json, HashMap.class);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (Exception ex){
            ex.printStackTrace();
        }
        for (Map.Entry entry: map.entrySet()) {
            System.out.println("Key : " + entry.getKey() + "  " +"Value: " + entry.getValue());
        }
        return map;
    }

    public HashMap<String, String> getJsonAsMap(String json)
    {
        try
        {
            ObjectMapper mapper = new ObjectMapper();
            TypeReference<Map<String,String>> typeRef = new TypeReference<Map<String,String>>() {};
            HashMap<String, String> result = mapper.readValue(json, typeRef);

            return result;
        }
        catch (Exception e)
        {
            throw new RuntimeException("Couldnt parse json:" + json, e);
        }
    }
}

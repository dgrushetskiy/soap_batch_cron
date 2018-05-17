package ru.mos.ugd.bus.gisrenupdate.utils;

public interface UtilObject<T> {

    T stringToObject(String tableName);

    T jsonToObject(String jsonObject);
}

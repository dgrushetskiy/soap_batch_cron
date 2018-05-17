package ru.mos.ugd.bus.gisrenupdate.model;

public class DataLogMin {

    private String operation;
    private String tableName;
    private String jsonNewObject;

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getJsonNewObject() {
        return jsonNewObject;
    }

    public void setJsonNewObject(String jsonNewObject) {
        this.jsonNewObject = jsonNewObject;
    }
}

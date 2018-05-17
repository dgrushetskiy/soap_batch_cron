package ru.mos.ugd.bus.gisrenupdate.model;

import ru.mos.ugd.bus.gisrenupdate.model.json.JsonType;

import java.util.Date;

public class DataLog {
    private String operation;
    private Date updateTime;
    private String tableName;
    private Long rowId;
    private String userLogin;
    private String userName;
    private String userIp;
    private String applicationName;
    private String applicationVersion;
    private String jsonNewObject;
    private String jsonOldObject;

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public Long getRowId() {
        return rowId;
    }

    public void setRowId(Long rowId) {
        this.rowId = rowId;
    }

    public String getUserLogin() {
        return userLogin;
    }

    public void setUserLogin(String userLogin) {
        this.userLogin = userLogin;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserIp() {
        return userIp;
    }

    public void setUserIp(String userIp) {
        this.userIp = userIp;
    }

    public String getApplicationName() {
        return applicationName;
    }

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    public String getApplicationVersion() {
        return applicationVersion;
    }

    public void setApplicationVersion(String applicationVersion) {
        this.applicationVersion = applicationVersion;
    }

    public String getJsonNewObject() {
        return jsonNewObject;
    }

    public void setJsonNewObject(String jsonNewObject) {
        this.jsonNewObject = jsonNewObject;
    }

    public String getJsonOldObject() {
        return jsonOldObject;
    }

    public void setJsonOldObject(String jsonOldObject) {
        this.jsonOldObject = jsonOldObject;
    }
}

package ru.mos.ugd.bus.gisrenupdate.model.json;

import java.math.BigInteger;

public class Mr extends JsonType {
    private Integer miPrinx;
    private String geoloc;
    private BigInteger id;
    private String nameTer;
    private String nameObj;
    private BigInteger idParent;
    private String vidTer;
    private String aoName;
    private String miStyle;
    private String okmoCode;

    public Integer getMiPrinx() {
        return miPrinx;
    }

    public void setMiPrinx(Integer miPrinx) {
        this.miPrinx = miPrinx;
    }

    public String getGeoloc() {
        return geoloc;
    }

    public void setGeoloc(String geoloc) {
        this.geoloc = geoloc;
    }

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public String getNameTer() {
        return nameTer;
    }

    public void setNameTer(String nameTer) {
        this.nameTer = nameTer;
    }

    public String getNameObj() {
        return nameObj;
    }

    public void setNameObj(String nameObj) {
        this.nameObj = nameObj;
    }

    public BigInteger getIdParent() {
        return idParent;
    }

    public void setIdParent(BigInteger idParent) {
        this.idParent = idParent;
    }

    public String getVidTer() {
        return vidTer;
    }

    public void setVidTer(String vidTer) {
        this.vidTer = vidTer;
    }

    public String getAoName() {
        return aoName;
    }

    public void setAoName(String aoName) {
        this.aoName = aoName;
    }

    public String getMiStyle() {
        return miStyle;
    }

    public void setMiStyle(String miStyle) {
        this.miStyle = miStyle;
    }

    public String getOkmoCode() {
        return okmoCode;
    }

    public void setOkmoCode(String okmoCode) {
        this.okmoCode = okmoCode;
    }
}

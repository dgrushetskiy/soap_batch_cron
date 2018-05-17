package ru.mos.ugd.bus.gisrenupdate.model.json;

import java.math.BigInteger;
import java.util.Date;

public class Kvren extends JsonType {
    private Integer miPrinx;
    private String geoloc;
    private Double id;
    private String kv;
    private BigInteger sq;
    private String nameao;
    private String namerajon;
    private Double idMr;
    private Double isMka;
    private Double isRen;
    private Double na;
    private String miStyle;
    private String altName;
    private String projectId;
    private String updateTime;
    private Long rowid;

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

    public Double getId() {
        return id;
    }

    public void setId(Double id) {
        this.id = id;
    }

    public String getKv() {
        return kv;
    }

    public void setKv(String kv) {
        this.kv = kv;
    }

    public BigInteger getSq() {
        return sq;
    }

    public void setSq(BigInteger sq) {
        this.sq = sq;
    }

    public String getNameao() {
        return nameao;
    }

    public void setNameao(String nameao) {
        this.nameao = nameao;
    }

    public String getNamerajon() {
        return namerajon;
    }

    public void setNamerajon(String namerajon) {
        this.namerajon = namerajon;
    }

    public Double getIdMr() {
        return idMr;
    }

    public void setIdMr(Double idMr) {
        this.idMr = idMr;
    }

    public Double getIsMka() {
        return isMka;
    }

    public void setIsMka(Double isMka) {
        this.isMka = isMka;
    }

    public Double getIsRen() {
        return isRen;
    }

    public void setIsRen(Double isRen) {
        this.isRen = isRen;
    }

    public Double getNa() {
        return na;
    }

    public void setNa(Double na) {
        this.na = na;
    }

    public String getMiStyle() {
        return miStyle;
    }

    public void setMiStyle(String miStyle) {
        this.miStyle = miStyle;
    }

    public String getAltName() {
        return altName;
    }

    public void setAltName(String altName) {
        this.altName = altName;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public Long getRowid() {
        return rowid;
    }

    public void setRowid(Long rowid) {
        this.rowid = rowid;
    }
}

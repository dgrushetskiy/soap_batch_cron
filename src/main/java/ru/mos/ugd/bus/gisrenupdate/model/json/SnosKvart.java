package ru.mos.ugd.bus.gisrenupdate.model.json;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.ZonedDateTime;
import java.util.Date;

public class SnosKvart extends JsonType {
    private Long unom;
    private Integer unkv;
    private Integer tp;
    private String kvnom;
    private Integer kmq;
    private BigDecimal ppl;
    private BigDecimal opl;
    private BigDecimal gpl;
    private String kad_num;
    private Integer etag;
    private Integer podezd_nomer;
    private Integer nom_in_etag;
    private ZonedDateTime update_time;
    private Long rowid;
    private Integer kl;
    private Integer status;

    public Long getUnom() {
        return unom;
    }

    public void setUnom(Long unom) {
        this.unom = unom;
    }

    public Integer getUnkv() {
        return unkv;
    }

    public void setUnkv(Integer unkv) {
        this.unkv = unkv;
    }

    public Integer getTp() {
        return tp;
    }

    public void setTp(Integer tp) {
        this.tp = tp;
    }

    public String getKvnom() {
        return kvnom;
    }

    public void setKvnom(String kvnom) {
        this.kvnom = kvnom;
    }

    public Integer getKmq() {
        return kmq;
    }

    public void setKmq(Integer kmq) {
        this.kmq = kmq;
    }

    public BigDecimal getPpl() {
        return ppl;
    }

    public void setPpl(BigDecimal ppl) {
        this.ppl = ppl;
    }

    public BigDecimal getOpl() {
        return opl;
    }

    public void setOpl(BigDecimal opl) {
        this.opl = opl;
    }

    public BigDecimal getGpl() {
        return gpl;
    }

    public void setGpl(BigDecimal gpl) {
        this.gpl = gpl;
    }

    public String getKad_num() {
        return kad_num;
    }

    public void setKad_num(String kad_num) {
        this.kad_num = kad_num;
    }

    public Integer getEtag() {
        return etag;
    }

    public void setEtag(Integer etag) {
        this.etag = etag;
    }

    public Integer getPodezd_nomer() {
        return podezd_nomer;
    }

    public void setPodezd_nomer(Integer podezd_nomer) {
        this.podezd_nomer = podezd_nomer;
    }

    public Integer getNom_in_etag() {
        return nom_in_etag;
    }

    public void setNom_in_etag(Integer nom_in_etag) {
        this.nom_in_etag = nom_in_etag;
    }

    public ZonedDateTime getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(ZonedDateTime update_time) {
        this.update_time = update_time;
    }

    public Long getRowid() {
        return rowid;
    }

    public void setRowid(Long rowid) {
        this.rowid = rowid;
    }

    public Integer getKl() {
        return kl;
    }

    public void setKl(Integer kl) {
        this.kl = kl;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}

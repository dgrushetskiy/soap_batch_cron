package ru.mos.ugd.bus.gisrenupdate.model.json;

import java.math.BigInteger;

public class StartKvartir extends JsonType {
    private Long id;
    private Long variantId;
    private String kadNum;
    private String kvnom;
    private Integer unkv;
    private Integer etag;
    private Integer kmq;
    private BigInteger gpl;
    private BigInteger opl;
    private BigInteger ppl;
    private BigInteger ksq;
    private Integer invalSutable;
    private Integer status;
    private Integer podezdNomer;
    private Integer nomInEtag;
    private Integer cnt;
    private Integer kl;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getVariantId() {
        return variantId;
    }

    public void setVariantId(Long variantId) {
        this.variantId = variantId;
    }

    public String getKadNum() {
        return kadNum;
    }

    public void setKadNum(String kadNum) {
        this.kadNum = kadNum;
    }

    public String getKvnom() {
        return kvnom;
    }

    public void setKvnom(String kvnom) {
        this.kvnom = kvnom;
    }

    public Integer getUnkv() {
        return unkv;
    }

    public void setUnkv(Integer unkv) {
        this.unkv = unkv;
    }

    public Integer getEtag() {
        return etag;
    }

    public void setEtag(Integer etag) {
        this.etag = etag;
    }

    public Integer getKmq() {
        return kmq;
    }

    public void setKmq(Integer kmq) {
        this.kmq = kmq;
    }

    public BigInteger getGpl() {
        return gpl;
    }

    public void setGpl(BigInteger gpl) {
        this.gpl = gpl;
    }

    public BigInteger getOpl() {
        return opl;
    }

    public void setOpl(BigInteger opl) {
        this.opl = opl;
    }

    public BigInteger getPpl() {
        return ppl;
    }

    public void setPpl(BigInteger ppl) {
        this.ppl = ppl;
    }

    public BigInteger getKsq() {
        return ksq;
    }

    public void setKsq(BigInteger ksq) {
        this.ksq = ksq;
    }

    public Integer getInvalSutable() {
        return invalSutable;
    }

    public void setInvalSutable(Integer invalSutable) {
        this.invalSutable = invalSutable;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getPodezdNomer() {
        return podezdNomer;
    }

    public void setPodezdNomer(Integer podezdNomer) {
        this.podezdNomer = podezdNomer;
    }

    public Integer getNomInEtag() {
        return nomInEtag;
    }

    public void setNomInEtag(Integer nomInEtag) {
        this.nomInEtag = nomInEtag;
    }

    public Integer getCnt() {
        return cnt;
    }

    public void setCnt(Integer cnt) {
        this.cnt = cnt;
    }

    public Integer getKl() {
        return kl;
    }

    public void setKl(Integer kl) {
        this.kl = kl;
    }
}

package ru.mos.ugd.bus.gisrenupdate.model.json;

import java.util.Date;

public class StartKvartirVariant extends JsonType {
    private Long id;
    private Integer novostroyId;
    private Integer startTepId;
    private Integer typ;
    private Integer status;
    private String name;
    private Date updateTime;
    private Long rowid;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getNovostroyId() {
        return novostroyId;
    }

    public void setNovostroyId(Integer novostroyId) {
        this.novostroyId = novostroyId;
    }

    public Integer getStartTepId() {
        return startTepId;
    }

    public void setStartTepId(Integer startTepId) {
        this.startTepId = startTepId;
    }

    public Integer getTyp() {
        return typ;
    }

    public void setTyp(Integer typ) {
        this.typ = typ;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Long getRowid() {
        return rowid;
    }

    public void setRowid(Long rowid) {
        this.rowid = rowid;
    }
}

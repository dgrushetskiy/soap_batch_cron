package ru.mos.ugd.bus.gisrenupdate.utils.impl;

public enum TableName {
    MR("pptegko.mr"),
    KVREN("renovastorage.kvren"),
    NOVOSTROY_MOS_RU("renovastorage.novostroy_mosru"),
    SNOS("renovastorage.snos"),
    SNOS_KVART("renovastorage.snos_kvart"),
    START_KVARTIR("renovastorage.start_kvartir"),
    START_KVARTIR_VARIANT("renovastorage.start_kvartir_variant"),
    STARTS_TEP("renovastorage.starts_tep");

    private String description;

    TableName(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}

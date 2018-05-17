package ru.mos.ugd.bus.gisrenupdate.utils.impl;

public class TableObject {
    TableName tableName;

    public TableObject(TableName tableName) {
        this.tableName = tableName;
    }

    public void selectTable(String objectName) {
        switch (tableName) {
            case MR:
                objectName = "Mr";
                //Mr mr = new Mr();
                break;
            case KVREN:
                objectName = "Kvren";
                //  Kvren kvren = new Kvren();
                break;
            case SNOS:
                objectName = "Snos";
                // Snos snos = new Snos();
                break;
            case SNOS_KVART:
                objectName = "SnosKvart";
                // SnosKvart snosKvart = new SnosKvart();
                break;
            case STARTS_TEP:
                objectName = "StartsTep";
                //   StartsTep startsTep = new StartsTep();
                break;
            case START_KVARTIR:
                objectName = "StartKvartir";
                //  StartKvartir startKvartir = new StartKvartir();
                break;
            case START_KVARTIR_VARIANT:
                objectName = "StartKvartirVariant";
                //  StartKvartirVariant startKvartirVariant = new StartKvartirVariant();
                break;
            case NOVOSTROY_MOS_RU:
                objectName = "NovostroyMosRu";
                //   NovostroyMosRu novostroyMosRu = new NovostroyMosRu();
                break;
            default:
                objectName = "Требуемые таблицы отсутствуют";
                break;
        }
    }
}

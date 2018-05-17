package ru.mos.ugd.bus.gisrenupdate.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import ru.mos.ugd.bus.gisrenupdate.model.DataLog;
import ru.mos.ugd.bus.gisrenupdate.model.DataLogMin;
import ru.mos.ugd.bus.gisrenupdate.model.json.*;
import ru.mos.ugd.bus.gisrenupdate.utils.impl.ParserJson;
import ru.mos.ugd.bus.gisrenupdate.utils.impl.TableName;
import ru.mos.ugd.bus.gisrenupdate.utils.impl.json.*;

import java.math.BigDecimal;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Component
public class ConverterObjectUtil {
    private static final Logger logger = LoggerFactory.getLogger(ConverterObjectUtil.class);

    static final String EMPTY = "";
    static final String POINT = String.valueOf('.');
    static final String COMMA = String.valueOf(',');
    static final String POINT_AS_STRING = ".";
    static final String COMMA_AS_STRING = ",";

//    public List<? extends JsonType> doSelectTable(DataLogMin dataLogMin) {
//        String operation = dataLogMin.getOperation();
//        String tableName = dataLogMin.getTableName();
//        String jsonObject = dataLogMin.getJsonNewObject();
//        List list = new ArrayList();
//        if (tableName.equals(TableName.MR)) {
//            List<Mr> mrList = new ArrayList<>();
//            JsonToMr jsonToMr = new JsonToMr();
//            Mr mr = jsonToMr.jsonToObject(jsonObject);
//            logger.info("mr " + mr);
//            mrList.add(mr);
//            logger.info("mrList " + mrList);
//            list.addAll(mrList);
//        } else if (tableName.equals(TableName.KVREN)) {
//            List<Kvren> kvrenList = new ArrayList<>();
//            JsonToKvren jsonToKvren = new JsonToKvren();
//            Kvren kvren = jsonToKvren.jsonToObject(jsonObject);
//            logger.info(" Kveren : " + kvren);
//            kvrenList.add(kvren);
//            logger.info(" kverenList " + kvrenList);
//            list.addAll(kvrenList);
//        } else if (tableName.equals(TableName.NOVOSTROY_MOS_RU)) {
//            List<NovostroyMosRu> novostroyMosRuList = new ArrayList<>();
//            JsonToNovostroyMosRu jsonToNovostroyMosRu = new JsonToNovostroyMosRu();
//            NovostroyMosRu novostroyMosRu = jsonToNovostroyMosRu.jsonToObject(jsonObject);
//            logger.info("NovostroyMosRu : " + novostroyMosRu);
//            novostroyMosRuList.add(novostroyMosRu);
//            logger.info("novostroyMosRuList : " + novostroyMosRu);
//            list.addAll(novostroyMosRuList);
//        } else if (tableName.equals(TableName.SNOS)) {
//            List<Snos> snosList = new ArrayList<>();
//            JsonToSnos jsonToSnos = new JsonToSnos();
//            Snos snos = jsonToSnos.jsonToObject(jsonObject);
//            logger.info("Snos : " + snos);
//            snosList.add(snos);
//            logger.info("snosList : " + snosList);
//            list.addAll(snosList);
//        } else if (tableName.equals(TableName.SNOS_KVART)) {
//            List<SnosKvart> snosKvartList = new ArrayList<>();
//            JsonToSnosKvart jsonToSnosKvart = new JsonToSnosKvart();
//            SnosKvart snosKvart = jsonToSnosKvart.jsonToObject(jsonObject);
//            logger.info("SnosKvart : " + snosKvart);
//            snosKvartList.add(snosKvart);
//            logger.info("snosKvartList: " + snosKvartList);
//            list.addAll(snosKvartList);
//        } else return new ArrayList<>();
//        return list;
//
//    }

    public List<? extends JsonType> doSelectTable(DataLogMin dataLogMin){
        String json = dataLogMin.getJsonNewObject();
        String tableName = dataLogMin.getTableName();
        ParserJson parserJson = new ParserJson();
        List list = new ArrayList();
        if (tableName.equals(TableName.SNOS_KVART)){
            List<SnosKvart> snosKvartList = new ArrayList<>();
            SnosKvart snosKvart = new SnosKvart();
            parserJson.parserJson(json);
            Map<String, String> propertyMap = parserJson.getJsonAsMap(json);
            Long unom = Long.valueOf(propertyMap.get("unom"));
            Integer tp = getInteger(propertyMap.get("tp"));
            Integer unkv = getInteger(propertyMap.get("unkv"));
            String kvnom = propertyMap.get("kvnom");
            Integer kmq = getInteger(propertyMap.get("kmq"));
            BigDecimal ppl = toBigDecimal(propertyMap.get("ppl"));
            BigDecimal opl = toBigDecimal(propertyMap.get("opl"));
            BigDecimal gpl = toBigDecimal(propertyMap.get("gpl"));
            String kad_num = propertyMap.get("kad_num");
            Integer etag = getInteger(propertyMap.get("etag"));
            Integer podezd_nomer = getInteger(propertyMap.get("podezd_nomer"));
            Integer nom_in_etag = getInteger(propertyMap.get("nom_in_etag"));
            ZonedDateTime update_time = ZonedDateTime.parse(propertyMap.get("update_time"));
            Long rowid = Long.valueOf(propertyMap.get("rowid"));
            Integer kl = getInteger(propertyMap.get("kl"));
            Integer status = getInteger(propertyMap.get("status"));

            snosKvart.setUnom(unom);
            snosKvart.setTp(tp);
            snosKvart.setUnkv(unkv);
            snosKvart.setKvnom(kvnom);
            snosKvart.setKmq(kmq);
            snosKvart.setPpl(ppl);
            snosKvart.setOpl(opl);
            snosKvart.setGpl(gpl);
            snosKvart.setKad_num(kad_num);
            snosKvart.setEtag(etag);
            snosKvart.setPodezd_nomer(podezd_nomer);
            snosKvart.setNom_in_etag(nom_in_etag);
            snosKvart.setUpdate_time(update_time);
            snosKvart.setRowid(rowid);
            snosKvart.setKl(kl);
            snosKvart.setStatus(status);
            snosKvartList.add(snosKvart);
            list.addAll(snosKvartList);
            System.out.println("snosKvart: " + snosKvart);
            System.out.println("snosKvartList :" + snosKvartList);
            System.out.println("list : " + list);
        } else return new ArrayList<>();
        return list;
    }

    public SnosKvart returnSnosKvart(DataLogMin dataLogMin){
        SnosKvart snosKvart = new SnosKvart();
        String json = dataLogMin.getJsonNewObject();
        String tableName = dataLogMin.getTableName();
        ParserJson parserJson = new ParserJson();
        if (tableName.equals(TableName.SNOS_KVART)){

            parserJson.parserJson(json);
            Map<String, String> propertyMap = parserJson.getJsonAsMap(json);
            Long unom = Long.valueOf(propertyMap.get("unom"));
            Integer tp = getInteger(propertyMap.get("tp"));
            Integer unkv = getInteger(propertyMap.get("unkv"));
            String kvnom = propertyMap.get("kvnom");
            Integer kmq = getInteger(propertyMap.get("kmq"));
            BigDecimal ppl = toBigDecimal(propertyMap.get("ppl"));
            BigDecimal opl = toBigDecimal(propertyMap.get("opl"));
            BigDecimal gpl = toBigDecimal(propertyMap.get("gpl"));
            String kad_num = propertyMap.get("kad_num");
            Integer etag = getInteger(propertyMap.get("etag"));
            Integer podezd_nomer = getInteger(propertyMap.get("podezd_nomer"));
            Integer nom_in_etag = getInteger(propertyMap.get("nom_in_etag"));
            ZonedDateTime update_time = ZonedDateTime.parse(propertyMap.get("update_time"));
            Long rowid = Long.valueOf(propertyMap.get("rowid"));
            Integer kl = getInteger(propertyMap.get("kl"));
            Integer status = getInteger(propertyMap.get("status"));

            snosKvart.setUnom(unom);
            snosKvart.setTp(tp);
            snosKvart.setUnkv(unkv);
            snosKvart.setKvnom(kvnom);
            snosKvart.setKmq(kmq);
            snosKvart.setPpl(ppl);
            snosKvart.setOpl(opl);
            snosKvart.setGpl(gpl);
            snosKvart.setKad_num(kad_num);
            snosKvart.setEtag(etag);
            snosKvart.setPodezd_nomer(podezd_nomer);
            snosKvart.setNom_in_etag(nom_in_etag);
            snosKvart.setUpdate_time(update_time);
            snosKvart.setRowid(rowid);
            snosKvart.setKl(kl);
            snosKvart.setStatus(status);
        }else return new SnosKvart();
        return snosKvart;
    }

    private static Integer getInteger(String str){
        if (str != null){
            return Integer.parseInt(str);
        }else {
            return new Integer(0);
        }
    }

    private static BigDecimal toBigDecimal(final String value) {
        if (value != null) {
            boolean negativeNumber = false;

            if (value.contains("(") && value.contains(")"))
                negativeNumber = true;
            if (value.endsWith("-") || value.startsWith("-"))
                negativeNumber = true;

            String parsedValue = value.replaceAll("[^0-9\\,\\.]", EMPTY);

            if (negativeNumber)
                parsedValue = "-" + parsedValue;

            int lastPointPosition = parsedValue.lastIndexOf(POINT);
            int lastCommaPosition = parsedValue.lastIndexOf(COMMA);

            //handle '1423' case, just a simple number
            if (lastPointPosition == -1 && lastCommaPosition == -1)
                return new BigDecimal(parsedValue);
            //handle '45.3' and '4.550.000' case, only points are in the given String
            if (lastPointPosition > -1 && lastCommaPosition == -1) {
                int firstPointPosition = parsedValue.indexOf(POINT);
                if (firstPointPosition != lastPointPosition)
                    return new BigDecimal(parsedValue.replace(POINT_AS_STRING, EMPTY));
                else
                    return new BigDecimal(parsedValue);
            }
            //handle '45,3' and '4,550,000' case, only commas are in the given String
            if (lastPointPosition == -1 && lastCommaPosition > -1) {
                int firstCommaPosition = parsedValue.indexOf(COMMA);
                if (firstCommaPosition != lastCommaPosition)
                    return new BigDecimal(parsedValue.replace(COMMA_AS_STRING, EMPTY));
                else
                    return new BigDecimal(parsedValue.replace(COMMA, POINT));
            }
            //handle '2.345,04' case, points are in front of commas
            if (lastPointPosition < lastCommaPosition) {
                parsedValue = parsedValue.replace(POINT_AS_STRING, EMPTY);
                return new BigDecimal(parsedValue.replace(COMMA, POINT));
            }
            //handle '2,345.04' case, commas are in front of points
            if (lastCommaPosition < lastPointPosition) {
                parsedValue = parsedValue.replace(COMMA_AS_STRING, EMPTY);
                return new BigDecimal(parsedValue);
            }
            throw new NumberFormatException("Unexpected number format. Cannot convert '" + value + "' to BigDecimal.");
        }
        return null;
    }
}

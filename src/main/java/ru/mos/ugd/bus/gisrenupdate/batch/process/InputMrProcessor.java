package ru.mos.ugd.bus.gisrenupdate.batch.process;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import ru.mos.ugd.bus.gisrenupdate.model.DataLog;
import ru.mos.ugd.bus.gisrenupdate.model.DataLogMin;
import ru.mos.ugd.bus.gisrenupdate.model.json.Mr;
import ru.mos.ugd.bus.gisrenupdate.utils.ConverterObjectUtil;
import ru.mos.ugd.bus.gisrenupdate.utils.impl.json.JsonToMr;

public class InputMrProcessor implements ItemProcessor<DataLogMin, Mr>{
    private static final Logger logger = LoggerFactory.getLogger(InputMrProcessor.class);
    @Autowired
    private ConverterObjectUtil converterObjectUtil;

    @Override
    public Mr process(DataLogMin dataLogMin) throws Exception {
        logger.info("Proses input min: {}", dataLogMin);
        JsonToMr jsonToMr = new JsonToMr();
        converterObjectUtil.doSelectTable(dataLogMin);
        System.out.println("help");
        String jsonObject = dataLogMin.getJsonNewObject();
        Mr out = jsonToMr.jsonToObject(jsonObject);
        return out;
    }
//    @Override
//    public Mr processD mr) throws Exception {
//        logger.info("Proses input min: {}", mr);
//        DataLogMin dataLogMin = new DataLogMin();
//        converterObjectUtil.doSelectTable(dataLogMin);
//        Mr out = new Mr();
//        if (mr!=null){
//            out.setMiPrinx(mr.getMiPrinx());
//            out.setGeoloc(mr.getGeoloc());
//            out.setId(mr.getId());
//            out.setNameTer(mr.getNameTer());
//            out.setNameObj(mr.getNameObj());
//            out.setIdParent(mr.getIdParent());
//            out.setVidTer(mr.getVidTer());
//            out.setAoName(mr.getAoName());
//            out.setMiStyle(mr.getMiStyle());
//            out.setOkmoCode(mr.getOkmoCode());
//        }
//        return out;
//    }
}

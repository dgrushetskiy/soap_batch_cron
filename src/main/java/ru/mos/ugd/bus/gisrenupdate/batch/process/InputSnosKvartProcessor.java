package ru.mos.ugd.bus.gisrenupdate.batch.process;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import ru.mos.ugd.bus.gisrenupdate.model.DataLogMin;
import ru.mos.ugd.bus.gisrenupdate.model.json.SnosKvart;
import ru.mos.ugd.bus.gisrenupdate.utils.ConverterObjectUtil;

public class InputSnosKvartProcessor implements ItemProcessor<DataLogMin,SnosKvart> {
    private static final Logger logger = LoggerFactory.getLogger(InputSnosKvartProcessor.class);

    @Autowired
    private ConverterObjectUtil converterObjectUtil;

    @Override
    public SnosKvart process(DataLogMin dataLogMin) throws Exception {
        logger.info("Proses input min: {}", dataLogMin);
        //converterObjectUtil.doSelectTable(dataLogMin);
        SnosKvart snosKvart = converterObjectUtil.returnSnosKvart(dataLogMin);
        logger.info("ввод данных мин произведен: {}", snosKvart);
        return snosKvart;
    }
}

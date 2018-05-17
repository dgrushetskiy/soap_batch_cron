package ru.mos.ugd.bus.gisrenupdate.batch.process;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;
import ru.mos.ugd.bus.gisrenupdate.model.DataLogMin;

public class InputProcessMin implements ItemProcessor<DataLogMin, DataLogMin> {
    private static final Logger logger = LoggerFactory.getLogger(InputProcessMin.class);

    @Override
    public DataLogMin process(DataLogMin dataLogMin) throws Exception {
        logger.info("Proses input min: {}", dataLogMin);
        DataLogMin output = new DataLogMin();
        output.setOperation(dataLogMin.getOperation());
        output.setTableName(dataLogMin.getTableName());
        output.setJsonNewObject(dataLogMin.getJsonNewObject());
        logger.info("ввод данных мин произведен: {}", output);
        return output;
    }
}

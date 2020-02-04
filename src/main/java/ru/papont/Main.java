package ru.papont;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.papont.rest.Rest;
import ru.papont.service.Service;

public class Main {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    private Rest rest = new Rest();
    private Service service = new Service();

    public void performTask(){
        logger.trace("MAIN This is a TRACE message.");
        logger.debug("MAIN This is a DEBUG message.");
        logger.info("MAIN This is an {} message.","INFO");
        logger.warn("MAIN This is a WARN message.");
        logger.error("MAIN This is an ERROR message.");

    }
}

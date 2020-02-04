package ru.papont.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Service {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    public Service() {
        logger.trace("Service This is a TRACE message.");
        logger.debug("Service This is a DEBUG message.");
        logger.info("Service This is an {} message.","INFO");
        logger.warn("Service This is a WARN message.");
        logger.error("Service This is an ERROR message.");
    }

}

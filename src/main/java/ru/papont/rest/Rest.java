package ru.papont.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Rest {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    public Rest() {
        logger.trace("REST This is a TRACE message.");
        logger.debug("REST This is a DEBUG message.");
        logger.info("REST This is an {} message.","INFO");
        logger.warn("REST This is a WARN message.");
        logger.error("REST This is an ERROR message.");
    }
}

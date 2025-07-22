package com.sashel.seller_service.logging;

import java.util.logging.Logger;

public class GlobalLogger {
    private GlobalLogger() {}
    private static final Logger logger = Logger.getLogger(GlobalLogger.class.getName());
    public static void log(String msg) {
        logger.info(msg);
    }
    public static void warn(String msg) {
        logger.warning(msg);
    }
}

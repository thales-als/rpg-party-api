package com.thaleslima.rpg_party_app.utils.logger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ApiLogger {
	private static final Logger logger = LoggerFactory.getLogger(ApiLogger.class);
	
	public static void logRequest(String s) {
        logger.info(s);
    }
    
    public static void logRequestDetails(String s) {
    	logger.debug(s);
    }
    
    public static void logDatabaseDetails(String s) {
    	logger.debug(s);
    }
    
    public static void logDatabaseError(String s) {
    	logger.error(s.toUpperCase());
    }
    
    public static void logRequestError(String s) {
    	logger.error(s.toUpperCase());
    }
}

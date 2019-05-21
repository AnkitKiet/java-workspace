package com.practice.util;

import java.util.logging.Logger;

public class Logging {

	public static Logger LOGGER = null;
	public static void writeToLog(String msg) {
		if(LOGGER == null){
			initLog();
			LOGGER.info(msg);
		}else{
			LOGGER.info(msg);
		}
	}

	private static void initLog() {
		LOGGER = Logger.getLogger(Logging.class.getName());

	}
	
}

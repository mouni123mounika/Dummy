package com.cg.registration.pojo;

import org.apache.log4j.Logger;

public class LoggerPojo {

	public static void main(String[] args) {
		Logger log = Logger.getLogger(LoggerPojo.class);

		log.debug("Hello this is a debug message");
		log.info("Hello this is an info message");
		log.fatal("Hello this is a fatal message");

	}

}

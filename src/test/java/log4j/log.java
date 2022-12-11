package log4j;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class log {

	  private static Logger logger = LogManager.getLogger(log.class);
		public static void main(String[] args) {
			System.out.println("log4j started");
			logger.trace("this is trace msg");
			logger.info("this is info msg");
			logger.error("this is error msg");
			logger.warn("this is warning msg");
			logger.fatal("this is fatal msg");
			System.out.println("completed");
			

		}


	}



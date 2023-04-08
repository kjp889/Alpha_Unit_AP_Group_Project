package Complaint_and_Query_Management_System;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoggingExample {

	private static final Logger Logger = LogManager.getLogger(LoggingExample.class);
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Logger.info("Test Info message");
		Logger.debug ("Test Debug Message");
		Logger.error ("Test Error message");
	    Logger.trace("Test Trace message");
		Logger.fatal ("Test Fatal message");
		Logger.warn("Test Warning Message");
			
	}

}

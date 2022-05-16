package com.wellsfargo.pronunciation.utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log {
	static {
		String log4jpath=System.getProperty("user.dir")+"/pronunciation/src/main/resources/log4j.xml";
	    System.setProperty("logoutputpath", System.getProperty("user.dir"));
	    System.setProperty("log4j.configurationFile",log4jpath);
	}
  public static Logger log=LogManager.getLogger(Log.class.getName())	;
  public static void startTestCase(String sTestCaseName) {
	  log.info("*********************************************************");
	  log.info("*********************************************************");
	  log.info("*******************"+sTestCaseName+"**************************");
	  log.info("*********************************************************");
	  log.info("*********************************************************");
	  
	  
  }
  public static void endTestCase(String sTestCaseName)
  {
	  log.info("*******************"+"E_N_D"+"**************************"); 
	  log.info("*********************************************************");
	  log.info("*********************************************************");
	  log.info("*********************************************************");
  }
}
	



package org.loginfo;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Log4jPropertyConfigurator {
	public static Logger log=Logger.getLogger(Log4jPropertyConfigurator.class);
	public static  void property() {
		PropertyConfigurator.configure("log4j.properties");
	
	}
}

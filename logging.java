package com.cucumber.framework.configreader;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class logging 
{
	public static Logger logger = Logger.getLogger(new Object() { }.getClass().getEnclosingClass());
	static
	{
		System.setProperty("log.timestamp", new  SimpleDateFormat("yyyy_MM_dd_HHmmss").format(new Date()));
		PropertyConfigurator.configure("log4j.properties");
	}
}

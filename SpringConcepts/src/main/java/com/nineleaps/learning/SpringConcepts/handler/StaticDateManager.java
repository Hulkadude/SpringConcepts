package com.nineleaps.learning.SpringConcepts.handler;

import java.text.SimpleDateFormat;
import java.util.Date;

public class StaticDateManager {
	
	private static StaticDateManager staticDateManager;
	
	private StaticDateManager() {}
	
	public static StaticDateManager createInstance() {
		return new StaticDateManager();
	}
	
	public String getDate() {
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
	    Date date = new Date();  
	    return formatter.format(date);  
	}

}

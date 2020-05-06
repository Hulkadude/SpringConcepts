package com.nineleaps.learning.SpringConcepts;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateManager {
	
	private static DateManager dateManager = new DateManager();
	
	public DateManager createInstance() {
		return dateManager;
	}
	
	public static String getDate() {
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
	    Date date = new Date();  
	    return formatter.format(date);  
	}

}

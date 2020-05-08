package com.nineleaps.learning.SpringConcepts.handler;

import java.text.SimpleDateFormat;
import java.util.Date;

public class StaticInnerClass {
	private static Date date;
	
	public static class DateProvider{
		public static String getDate() {
			SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
		    date = new Date();  
		    return formatter.format(date);  
		}
		
	}
	
}

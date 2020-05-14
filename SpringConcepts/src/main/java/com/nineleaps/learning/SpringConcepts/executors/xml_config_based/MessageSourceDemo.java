package com.nineleaps.learning.SpringConcepts.executors.xml_config_based;

import java.util.Locale;

import org.springframework.context.MessageSource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MessageSourceDemo {
	public static void main(String[] args) {
		MessageSource resources = new ClassPathXmlApplicationContext("configurations/applicationContext.xml");
		String message = resources.getMessage("message", new Object [] {""+MessageSource.class}, "Default", Locale.ENGLISH);
		System.out.println(message);
	}
}

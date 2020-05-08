package com.nineleaps.learning.SpringConcepts.handler;

public class DemoClassA {
	private DemoClassB demoClassB;

	
	public void setDemoClassB(DemoClassB demoClassB) {
		this.demoClassB = demoClassB;
	}


	public String getMessage() {
		return "I am Demo A class";
	}
	
	
}

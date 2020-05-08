package com.nineleaps.learning.SpringConcepts.handler;

public class ArbitraryClassA {
	private ArbitraryClassB arbitraryClassB;

	public ArbitraryClassA(ArbitraryClassB arbitraryClassB) {
		this.arbitraryClassB = arbitraryClassB;
	}

	public String getMessage() {
		return "I am Arbitrary A class";
	}
	
	
}

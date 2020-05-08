package com.nineleaps.learning.SpringConcepts.handler;

import java.lang.reflect.Method;

import org.springframework.beans.factory.support.MethodReplacer;

public class ReplacementMethod implements MethodReplacer{

	public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
		return "Replacement Workout";
	}

}

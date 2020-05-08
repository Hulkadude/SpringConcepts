package com.nineleaps.learning.SpringConcepts.scope;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.config.Scope;

public class CustomScope implements Scope {

	private Map<String, Object> scopedObjects = Collections.synchronizedMap(new HashMap<String, Object>());
	private Map<String, Runnable> destructionCallbacks = Collections.synchronizedMap(new HashMap<String, Runnable>());

	public Object get(String name, ObjectFactory<?> objectFactory) {
		if (!scopedObjects.containsKey(name)) {
			scopedObjects.put(name, objectFactory.getObject());
		}
		return scopedObjects.get(name);
	}

	public Object remove(String name) {
		destructionCallbacks.remove(name);
		return scopedObjects.remove(name);
	}

	public void registerDestructionCallback(String name, Runnable callback) {
		destructionCallbacks.put(name, callback);

	}

	public Object resolveContextualObject(String key) {
		// TODO Auto-generated method stub
		return null;
	}

	public String getConversationId() {
		return "custom_scope";
	}

}

package com.nineleaps.learning.SpringConcepts.services.coach_service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

public class DummyCoach {
	Properties properties = new Properties();
	Map<String,String> contactDetails = new HashMap<String, String>();
	List<String> feedbacks = new ArrayList<String>();
	Set<String> teams = new HashSet<String>();
	
	public void getProperties() {
		System.out.println("Coach's Properties:");
		for(Entry<Object, Object> prop : properties.entrySet()) {
			System.out.println(prop.getKey()+" : "+prop.getValue());
		}
	}
	public void setProperties(Properties properties) {
		this.properties = properties;
	}
	public void getContactDetails() {
		System.out.println("Coach's Contact Information:");
		for(Map.Entry<String, String> contacts : contactDetails.entrySet()) {
			System.out.println(contacts.getKey()+" : "+contacts.getValue());
		}
	}
	public void setContactDetails(Map<String, String> contactDetails) {
		this.contactDetails = contactDetails;
	}
	public void getFeedbacks() {
		System.out.println("Coach's feedbacks:");
		for(String feed:feedbacks) {
			System.out.println(feed+",");
		}
	}
	public void setFeedbacks(List<String> feedbacks) {
		this.feedbacks = feedbacks;
	}
	public void getTeams() {
		System.out.println("Coach's history:");
		for(String team:teams) {
			System.out.println(team+",");
		}
	}
	public void setTeams(Set<String> teams) {
		this.teams = teams;
	}
	
	
	
}

package com.nineleaps.learning.SpringConcepts.services.feedback_service;

import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

@Component
public class FeedbackLister {
	
	@Autowired(required = false)
	private FeedbackService[] feedbackServices;
	
	private Set<FeedbackService> feeds;
	
	private Map<String,FeedbackService> feedsMap;
	
	@Autowired
    public void setFeeds(Set<FeedbackService> feeds) {
        this.feeds = feeds;
    }
	
	@Autowired
    public void setFeedsMap(@Nullable Map<String,FeedbackService> feedsMap) {
        this.feedsMap = feedsMap;
    }
	
	public void getInformation() {
		System.out.println("Array Size: "+feedbackServices.length);
		
		System.out.println("Set: "+feeds);
		
		System.out.println("Map: "+feedsMap);
	}

}

package com.nineleaps.learning.SpringConcepts.services.coach_service;

import com.nineleaps.learning.SpringConcepts.model.Information;
import com.nineleaps.learning.SpringConcepts.services.coach_service.Interface.Coach;
import com.nineleaps.learning.SpringConcepts.services.feedback_service.FeedbackService;

public class CricketCoach implements Coach {
	
	private FeedbackService feedbackService;
	private int age;
	private String gender;
	private Information information = new Information();

	public CricketCoach() {}

	public CricketCoach(int age, String gender) {
		this.age = age;
		this.gender = gender;
	}

	public String getDailyWorkout() {
		return "Practice bowling for 15 min";
	}

	public String getDailyFeedback() {
		return feedbackService.getFeedback();
	}
	
	public String getDetails() {
		
		return "Age: "+age+"\nGender: "+gender+"\n"+getInformation().toString();
	}

	public void setFeedbackService(FeedbackService feedbackService) {
		this.feedbackService = feedbackService;
	}
	
	

	public Information getInformation() {
		return information;
	}

	public void setInformation(Information information) {
		this.information = information;
	}
	
	

}

package com.nineleaps.learning.SpringConcepts;

public class CricketCoach implements Coach {
	
	private FeedbackService feedbackService;
	private Information information = new Information();

	public CricketCoach() {}
	
	public String getDailyWorkout() {
		return "Practice bowling for 15 min";
	}

	public String getDailyFeedback() {
		return feedbackService.getFeedback();
	}
	
	public String getDetails() {
		return getInformation().toString();
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

package com.nineleaps.learning.SpringConcepts.services.coach_service;

import com.nineleaps.learning.SpringConcepts.services.coach_service.Interface.Coach;
import com.nineleaps.learning.SpringConcepts.services.feedback_service.ExpertFeedbackService;
import com.nineleaps.learning.SpringConcepts.services.feedback_service.FeedbackService;

public abstract class FootballCoach {
	
	protected abstract FeedbackService createFeedbackService();
	
	public String getDailyWorkout(){
		return "Practice Kicks..!!";
	}

	public String getDailyFeedback() {
		return createFeedbackService().getFeedback();
	}

}

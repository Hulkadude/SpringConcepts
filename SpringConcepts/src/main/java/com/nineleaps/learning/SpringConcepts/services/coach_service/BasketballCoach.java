package com.nineleaps.learning.SpringConcepts.services.coach_service;

import com.nineleaps.learning.SpringConcepts.services.coach_service.Interface.Coach;
import com.nineleaps.learning.SpringConcepts.services.feedback_service.DummyFeedbackService;

public class BasketballCoach implements Coach {
	
	public String getDailyWorkout(){
		return "Spend 30 min on Leap shot...!!";
	}

	public String getDailyFeedback() {
		return DummyFeedbackService.getDummyFeedback();
	}
}

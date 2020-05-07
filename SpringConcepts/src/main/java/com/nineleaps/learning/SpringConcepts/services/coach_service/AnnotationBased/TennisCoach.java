package com.nineleaps.learning.SpringConcepts.services.coach_service.AnnotationBased;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import javax.annotation.*;

import com.nineleaps.learning.SpringConcepts.services.coach_service.Interface.Coach;
import com.nineleaps.learning.SpringConcepts.services.feedback_service.FeedbackService;

@Component
@Scope("singleton")							//Default scope
public class TennisCoach implements Coach {

	private FeedbackService feedbackService;
	
	
	@Autowired
	public TennisCoach(FeedbackService feedbackService) {
		this.feedbackService = feedbackService;
	}

	public String getDailyWorkout() {
		return "Practice back hand for 50 min";
	}

	public String getDailyFeedback() {
		return feedbackService.getFeedback();
	}
	
	@PostConstruct
	public void startup() {
		System.out.println("Starting up...!!");
	}
	
	@PreDestroy
	public void closeDown() {
		System.out.println("Closing down....!!");
	}
}

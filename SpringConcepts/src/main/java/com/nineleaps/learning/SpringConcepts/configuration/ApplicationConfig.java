package com.nineleaps.learning.SpringConcepts.configuration;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Description;
import org.springframework.context.annotation.Profile;

import com.nineleaps.learning.SpringConcepts.services.coach_service.Interface.Coach;
import com.nineleaps.learning.SpringConcepts.services.coach_service.JavaConfigBased.SwimCoach;
import com.nineleaps.learning.SpringConcepts.services.feedback_service.FeedbackService;
import com.nineleaps.learning.SpringConcepts.services.feedback_service.NegativeFeedbackService;

@Configuration
public class ApplicationConfig {

	@Bean
	@Qualifier("negativeFeedbackService")
	@Description("This is negative feedback implementing feedback interface")
	public FeedbackService negativeFeedbackService() {
		return new NegativeFeedbackService();
	}

	@Bean
	public Coach swimCoach() {
		return new SwimCoach(negativeFeedbackService());
	}
	
}

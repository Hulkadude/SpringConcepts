package com.nineleaps.learning.SpringConcepts.executors;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.nineleaps.learning.SpringConcepts.controllers, com.nineleaps.learning.SpringConcepts.Repositories, com.nineleaps.learning.SpringConcepts.services")
public class RestApplication {
	public static void main(String[] args) {
		SpringApplication.run(RestApplication.class, args);
	}
}

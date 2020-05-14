package com.nineleaps.learning.SpringConcepts.controllers;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.nineleaps.learning.SpringConcepts.model.Book;
import com.nineleaps.learning.SpringConcepts.services.BookService;

@Controller
@RequestMapping("spring-concepts")
@PropertySource("classpath:dummy.properties")
public class BookController {

	@Autowired
	private BookService bookService;

	@Autowired
	ConfigurableEnvironment environment;

	@PostConstruct
	public void setEnvProp() {
		for (String profile : environment.getActiveProfiles()) {
			System.out.println(profile);
		}
		environment.setActiveProfiles("dev");
		
		for (String profile : environment.getActiveProfiles()) {
			System.out.println(profile);
		}
		
		for (String profile : environment.getDefaultProfiles()) {
			System.out.println("Default Profile: "+profile);
		}
		
		environment.setDefaultProfiles("dev");
		for (String profile : environment.getDefaultProfiles()) {
			System.out.println("Default Profile: "+profile);
		}
		
		System.out.println("Contains Property: "+ environment.containsProperty("dummy.property"));
	}

	@GetMapping("/books/list")
	public @ResponseBody List<Book> getBooks() {
		return bookService.findAllBooks();
	}
}

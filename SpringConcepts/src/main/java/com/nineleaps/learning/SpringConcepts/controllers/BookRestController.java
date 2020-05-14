package com.nineleaps.learning.SpringConcepts.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nineleaps.learning.SpringConcepts.model.Book;
import com.nineleaps.learning.SpringConcepts.services.BookService;

@RestController
@RequestMapping("spring-concepts")
public class BookRestController {
	
	@Autowired
	private BookService bookService;

	@GetMapping("/books/rest/list")
    public List<Book >getBooks() {
        return bookService.findAllBooks();
    }
}

package com.nineleaps.learning.SpringConcepts.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.nineleaps.learning.SpringConcepts.Repositories.BookRepository;
import com.nineleaps.learning.SpringConcepts.model.Book;

@Service
public class BookService {
	
	@Autowired
	private BookRepository bookRepository;

	public List<Book> findAllBooks() {
		return bookRepository.findAllBooks();
	}

}

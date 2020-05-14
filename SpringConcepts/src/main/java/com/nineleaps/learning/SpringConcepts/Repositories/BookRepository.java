package com.nineleaps.learning.SpringConcepts.Repositories;

import java.util.List;

import com.nineleaps.learning.SpringConcepts.model.Book;


public interface BookRepository {
	public List<Book> findAllBooks();
}

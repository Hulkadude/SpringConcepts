package com.nineleaps.learning.SpringConcepts.Repositories;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.nineleaps.learning.SpringConcepts.Annotations.Prod;
import com.nineleaps.learning.SpringConcepts.model.Book;

@Repository
@Prod
public class BookRepositoryImpl implements BookRepository{
	Map<Integer,Book> books = new HashMap();
	
	public BookRepositoryImpl() {
		books.put(1,new Book(1, "Book1", "Author1"));
		books.put(2,new Book(2, "Book2", "Author2"));
		books.put(3,new Book(3, "Book3", "Author3"));
		books.put(4,new Book(4, "Book4", "Author4"));
		books.put(5,new Book(5, "Book5", "Author5"));
	}
	
	public List<Book> findAllBooks() {
		List<Book> booksList = new ArrayList<Book>();
		booksList.addAll(books.values());
		return booksList;
	}

}

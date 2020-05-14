package com.nineleaps.learning.SpringConcepts.Repositories;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.nineleaps.learning.SpringConcepts.Annotations.Dev;
import com.nineleaps.learning.SpringConcepts.model.Book;

@Repository
@Dev
public class BookRepositoryImplDev implements BookRepository{
	Map<Integer,Book> books = new HashMap();
	
	public BookRepositoryImplDev() {
		books.put(1,new Book(1, "BookDev1", "Author1"));
		books.put(2,new Book(2, "BookDev2", "Author2"));
		books.put(3,new Book(3, "BookDev3", "Author3"));
		books.put(4,new Book(4, "BookDev4", "Author4"));
		books.put(5,new Book(5, "BookDev5", "Author5"));
	}
	
	public List<Book> findAllBooks() {
		List<Book> booksList = new ArrayList<Book>();
		booksList.addAll(books.values());
		return booksList;
	}

}

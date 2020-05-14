package com.nineleaps.learning.SpringConcepts.model;

public class Book {
	
	private int id;
	
	private String name;
	
	private String Author;
	

	public Book(int id, String name, String author) {
		super();
		this.id = id;
		this.name = name;
		Author = author;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getAuthor() {
		return Author;
	}
	
	
	

}

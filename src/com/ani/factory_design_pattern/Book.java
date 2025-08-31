package com.ani.factory_design_pattern;

public class Book 
{
	private String title;
	private String author;
	private double price;
	
	public Book(String title, String author, double price) 
	{
		super();
		this.title = title;
		this.author = author;
		this.price = price;
	}

	// set factory design pattern
	public static Book getBookObject()
	{
		return new Book("Java","Jems",200);
	}

	@Override
	public String toString() 
	{
		return "Book [title=" + title + ", author=" + author + ", price=" + price + "]";
	}
	
	
	
	

	
}

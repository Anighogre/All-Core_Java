package com.ani.lab_31_jul_constructor;

public class Book {

	private String title;
	private String author;
	private double price;
	
	public Book(String title, String author, double price) 
	{
		this.title = title;
		this.author = author;
		this.price = price;
	}

	
	@Override
	public String toString() 
	{
		return "Book [title=" + title + ", author=" + author + ", price=" + price + "]";
	}
	
	
	public void applyDiscount(double discountPercentage)
	{
		if(discountPercentage < 0)
		{
			System.err.println("Error: Invalid discount percentage.");
			System.err.println("Title :"+this.title);
			System.out.println("Author :"+this.author);
			System.out.println("Price :"+this.price);
			System.exit(0);
		} else if(this.price < 0)
		{
			System.err.println("Error : Book Price cannot be negative.");
			System.out.println("Title: Negative Price Book");
			System.out.println("Author: No Author");
			System.out.println("Price :"+this.price);
			System.exit(0);
		} else {
			this.price = this.price - (this.price*(discountPercentage/100));
			System.out.println("After discount price :"+this.price);
		}
	}
	
	
}

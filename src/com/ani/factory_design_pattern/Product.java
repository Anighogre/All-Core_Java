package com.ani.factory_design_pattern;

import java.util.Scanner;

public class Product 
{
	private int id;
	private String name;
	private double price;
	
	public Product(int id, String name, double price) 
	{
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	
	public static Product getProductObject()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Product id :");
		int id = Integer.parseInt(sc.nextLine());
		
		System.out.print("Enter Product name :");
		String name = sc.nextLine();
		
		System.out.print("Enter Product price :");
		double price = Double.parseDouble(sc.nextLine());
		
		Product p1 = new Product(id,name,price);
		
		return p1;
	}


	@Override
	public String toString() 
	{
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	
	
	
	
}

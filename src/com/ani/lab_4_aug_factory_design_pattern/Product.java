package com.ani.lab_4_aug_factory_design_pattern;

import java.util.Scanner;

public class Product 
{
	private int id;
	private String name;
	private double price;
	private int quantity;
	
	private Product(int id, String name, double price,int quantity) 
	{
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public static Product createProductObject()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter product id :");
		int id = Integer.parseInt(sc.nextLine());
		
		System.out.print("Enter product name :");
		String name = sc.nextLine();
		
		System.out.print("Enter product price :");
		double price = Double.parseDouble(sc.nextLine());
		
		System.out.print("Enter No. of product :");
		int noOfProduct = Integer.parseInt(sc.nextLine());
		
		return new Product(id,name,price,noOfProduct);
	}

	@Override
	public String toString() 
	{
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", quantity=" + quantity + "]";
	}
	
	
	public double calculateTotalAmount()
	{
		double total = this.price * this.quantity;
		if(total > 1000)
		{
			return total - (total*0.10);
		} 
		else if(total > 500)
		{
			return total - (total*0.05);
		}
		else return total;
	}
	
	
	

}

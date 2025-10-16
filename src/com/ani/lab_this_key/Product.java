package com.ani.lab_this_key;

public class Product {
	private int productId;
	private String productName;
	private double productPrice;
	
//	public Product(int productId, String productName, double productPrice)
//	{
//		this.productId = productId;
//		this.productName = productName;
//		this.productPrice = productPrice;
//	}
	
	public void setProductData(int productId, String productName, double productPrice)
	{
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
	}
	
	public void getProductData()
	{
		System.out.println("product id :"+productId);
		System.out.println("product Name :"+productName);
		System.out.println("product price :"+productPrice);
	}
	

}

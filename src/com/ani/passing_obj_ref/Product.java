package com.ani.passing_obj_ref;

public class Product {
	private int productId;
	private String productName;
	
	public Product(int productId, String productName) 
	{
		super();
		this.productId = productId;
		this.productName = productName;
	}
	
	
	public Product(Product p)
	{
		this.productId = p.productId;
		this.productName = p.productName;
	}


	@Override
	public String toString() 
	{
		return "Product [productId=" + productId + ", productName=" + productName + "]";
	}
	
	

}

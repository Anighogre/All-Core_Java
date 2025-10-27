package com.ani.shallow_copy;

public class Laptop 
	{
	private String brand;
	private double price;
	
	public Laptop(String brand, double price)
	{
		super();
		this.brand = brand;
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() 
	{
		return "Laptop [brand=" + brand + ", price=" + price + "]";
	}
	
	
	

}

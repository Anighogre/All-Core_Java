package com.ani.lab_1_aug_constructor;

public class Rectangle 
{

	private double width;
	private double height;
	
	public Rectangle(double width, double height) 
	{
		super();
		if(width < 0 || height < 0)
		{
			System.err.println("Width and height must be non-negative.");
			System.exit(0);
		}
		
		this.width = width;
		this.height = height;
	}
	
	
	public double getArea()
	{
		return this.height * this.width;
	}
	
	public double getPerimeter()
	{
		return 2*(this.width + this.height);
	}
	
	
	
}

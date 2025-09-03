package com.ani.lab_20_aug_simple_vehicle_inheritance;

public class Bike extends Vehicle 
{
	protected String type;

	public Bike(String make, String model, int year, String type) 
	{
		
		super(make, model, year);
		this.type = type;
	}
	
	public void displayDetails()
	{
		super.displayDetails();
		System.out.println("Type: "+this.type);
	}
	
	
}

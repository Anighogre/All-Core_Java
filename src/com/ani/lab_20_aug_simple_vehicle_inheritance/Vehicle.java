package com.ani.lab_20_aug_simple_vehicle_inheritance;

public class Vehicle 
{
	protected String make;
	protected String model;
	protected int year;
	
	public Vehicle(String make, String model, int year)
	{
		super();
		if(year<=0)
		{
			System.err.println("Error Invalid Input");
			System.exit(0);
		}
		this.make = make;
		this.model = model;
		this.year = year;
	}
	
	public void displayDetails()
	{
		System.out.println("Make: "+this.make);
		System.out.println("Model: "+this.model);
		System.out.println("Year: "+this.year);
	}
}

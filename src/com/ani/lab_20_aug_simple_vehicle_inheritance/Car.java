package com.ani.lab_20_aug_simple_vehicle_inheritance;

public class Car extends Vehicle 
{
	protected int numberOfDoors;

	public Car(String make, String model, int year, int numberOfDoors)
	{
		super(make, model, year);
		
		if(numberOfDoors<=0)
		{
			System.err.println("Error Invalid Input");
			System.exit(0);
		}
		this.numberOfDoors = numberOfDoors;
	}
	
	public void displayDetails()
	{
		super.displayDetails();
		System.out.println("Number of Doors: "+this.numberOfDoors);
	}
	
	
}

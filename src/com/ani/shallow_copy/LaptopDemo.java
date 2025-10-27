package com.ani.shallow_copy;

public class LaptopDemo {

	public static void main(String[] args) {
	
		Laptop lap1 = new Laptop("DELL", 90000);
		System.out.println(lap1);
		
		Laptop lap2 = lap1;
		System.out.println(lap1);
		
		System.out.println("Modification by using lapp2");
		
		lap2.setBrand("HP");
		lap2.setPrice(95000);
		System.out.println(lap1);
		System.out.println(lap2);
	}
	
	

}

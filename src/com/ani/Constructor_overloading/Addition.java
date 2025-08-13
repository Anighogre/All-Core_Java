package com.ani.Constructor_overloading;

public class Addition 
{
	public Addition(int a, int b)
	{
		this("Dataa"," Base");
		System.out.println("Addition of integer is :"+(a+b));
	}
	
	public Addition(double a, double b)
	{
		System.out.println("Addition of double is :"+(a+b));
	}
	
	public Addition(String a, String b)
	{
		this(3.3,4.5);
		System.out.println("Addition of Strings is :"+(a+b));
	}
}

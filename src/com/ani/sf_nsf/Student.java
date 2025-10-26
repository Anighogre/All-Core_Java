package com.ani.sf_nsf;

public class Student {
	int rollNumber;
	String studentName;
	String studentAddress;
	static String collegeName = "NIT";
	static String course = "Java";
	
	public void setStudentInfo(int roll,String name,String addr)
	{
		rollNumber = roll;
		studentName = name;
		studentAddress = addr;
	}
	
	public void getStudentInfo()
	{
		System.out.println("Roll number is :"+rollNumber);
		System.out.println("Name is :"+studentName);
		System.out.println("Address is :"+studentAddress);
		System.out.println("College Name  is :"+collegeName);
		System.out.println("Course  is :"+course);
		
	}

}

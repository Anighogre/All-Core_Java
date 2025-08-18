package com.ani.lab_18_Aug_stud_fee_mgmt_system_inheritance;

public class Student 
{
	protected int studentId;
	protected String name;
	protected double examFee;
	
	public Student(int studentId, String name,double examFee)
	{
		super();
		
		if(studentId<0)
		{
			System.err.println("Student Id cannot be zero OR -ve");
			System.exit(0);
		}
		
		if(name == null || name.trim().isEmpty() || name.equals("null"))
		{
			System.err.println("Name cannot be null or blank");
			System.exit(0);
		}
		
		if(examFee <0)
		{
			System.err.println("Exam fees cannot be negative");
			System.exit(0);
		}
		
		this.studentId = studentId;
		this.name = name;
		this.examFee= examFee;
	}
	
	
}

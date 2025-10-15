package com.ani.lab_4_aug_factory_design_pattern;

import java.util.Scanner;

public class Student 
{
	private String name;
	private int age;
	private String grade;
	
	private Student(String name, int age, String grade) 
	{
		super();
		this.name = name;
		this.age = age;
		this.grade = grade;
	}
	
	public static Student createStudentObject()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter student name :");
		String name = sc.nextLine();
		
		System.out.println("Enter student age :");
		int age = Integer.parseInt(sc.nextLine());
		
		System.out.println("Enter student grade :");
		String grade = sc.next();
		
		Student s1 = new Student(name,age,grade);
		return s1;
	}

	
	@Override
	public String toString() 
	{
		return "Student [name=" + name + ", age=" + age + ", grade=" + grade + "]";
	}
	
	
	

}

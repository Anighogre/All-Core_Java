package com.ani.lab_4_aug_factory_design_pattern;

import java.util.Scanner;

public class Employee 
{
	private String name;
	private int id;
	private String department;
	private double salary;
	
	private Employee(String name, int id, String department, double salary) 
	{
		super();
		this.name = name;
		this.id = id;
		this.department = department;
		this.salary = salary;
	}
	
	
	public static Employee createEmployeeObject()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter employee name :");
		String name = sc.nextLine();
		
		System.out.println("Enter employee id :");
		int id = Integer.parseInt(sc.nextLine());
		
		System.out.println("Enter employee department[Sales, Engineering, HR, Other] :");
		String dept = sc.next().toLowerCase();
		
		System.out.println("Enter employee salary :");
		double salary = sc.nextDouble();
		
		return new Employee(name,id,dept,salary);
	}


	@Override
	public String toString() 
	{
		return "Employee [name=" + name + ", id=" + id + ", department=" + department + ", salary=" + salary + "]";
	}
	
	
	public double calculateAnnualSalary()
	{
		double res = switch(this.department)
		{
			case "sales" -> {
				yield (this.salary*12) + (this.salary*12*0.10);
			}
			case "engineering" -> {
				yield (this.salary*12) + (this.salary*12*0.15);
			}
			case "hr" -> {
				yield (this.salary*12) + (this.salary*12*0.08);
			}
			default -> {
				yield (this.salary*12) + (this.salary*12*0.05);
			}
		};
		return res;
	}
	

}

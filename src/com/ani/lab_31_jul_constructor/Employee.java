package com.ani.lab_31_jul_constructor;

public class Employee {

	private String firstName;
	private String lastName;
	private int employeeId;
	private double salary;
	private int noOfProject;
	
	public Employee(String firstName, String lastName, int employeeId, double salary, int noOfProject) 
	{
		
		if(noOfProject < 0)
		{
			System.err.println("Number of projects cannot be negative");
			System.out.println("saalry remains :"+salary);
			System.exit(0);
		}
		
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.employeeId = employeeId;
		this.salary = salary;
		this.noOfProject = noOfProject;
	}

	@Override
	public String toString() 
	{
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", employeeId=" + employeeId
				+ ", salary=" + salary + ", NoOfProject=" + noOfProject + "]";
	}
	
	
	public void calculateSalary()
	{
		if(this.noOfProject > 5 && this.noOfProject <=10)
		{
			this.salary = this.salary + 5000;
			System.out.println("Updated salary is :"+this.salary);
		} else if(this.noOfProject > 10 && this.noOfProject <=20)
		{
			this.salary = this.salary + 10000;
			System.out.println("Updated salary is :"+this.salary);
		} else {
			this.salary = this.salary + 15000;
			System.out.println("Updated salary is :"+this.salary);
		}
	}
	
	
	
	
	
}

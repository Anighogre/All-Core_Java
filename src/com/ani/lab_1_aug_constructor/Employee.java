package com.ani.lab_1_aug_constructor;

public class Employee 
{
	private int employeeNumber;
	private String employeeName;
	private double employeeSalary;
	
	public Employee(int employeeNumber, String employeeName, double employeeSalary) 
	{
		super();
		this.employeeNumber = employeeNumber;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
	}

	
	public int getEmployeeNumber() {
		return this.employeeNumber;
	}


	public String getEmployeeName() {
		return this.employeeName;
	}


	public double getEmployeeSalary() 
	{
		return this.employeeSalary;
	}

	
	public void setEMployeeDetails()
	{
		if(this.employeeSalary >= 90000)
		{
			System.out.println("Employee is a Developer");
		} else if(this.employeeSalary < 90000 && this.employeeSalary >= 60000)
		{
			System.out.println("Employee is a Designer");	
		} else {
			System.out.println("Employee is a Tester");
		}
	}
	
	

}

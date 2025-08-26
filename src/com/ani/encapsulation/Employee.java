package com.ani.encapsulation;

public class Employee 
{
	
	private int employeeId;
	private String employeeName;
	private double employeeSalary;
	
	public Employee(int employeeId, String employeeName, double employeeSalary) 
	{
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
	}
	

	public int getEmployeeId() 
	{
		return this.employeeId;
	}

	public void setEmployeeId(int employeeId) 
	{
		this.employeeId = employeeId;
	}

	public String getEmployeeName() 
	{
		return this.employeeName;
	}

	public void setEmployeeName(String employeeName) 
	{
		this.employeeName = employeeName;
	}

	public double getEmployeeSalary() 
	{
		return this.employeeSalary;
	}

	public void setEmployeeSalary(double employeeSalary) 
	{
		if(employeeSalary <= this.employeeSalary)
		{
			System.err.println("Increment amount should be positive");
			System.exit(0);
		}
		this.employeeSalary = employeeSalary;
	}


	@Override
	public String toString() 
	{
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeSalary="
				+ employeeSalary + "]";
	}
	
	
	

}

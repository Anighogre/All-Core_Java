package com.ani.lab_6_aug_pass_by_obj_value;

public class Employee 
{
	private int employeeId;
	private String employeeName;
	private double basicSalary;
	private double hRAPer;
	private double dAPer;
	
	public Employee(int employeeId, String employeeName, double basicSalary, double hRAPer, double dAPer) 
	{
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.basicSalary = basicSalary;
		this.hRAPer = hRAPer;
		this.dAPer = dAPer;
	}
	
	public double calculateGrossSalary()
	{
		double grossSal = this.basicSalary + this.hRAPer + this.dAPer;
		return grossSal;
	}

	@Override
	public String toString() 
	{
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", basicSalary=" + basicSalary
				+ ", hRAPer=" + hRAPer + ", dAPer=" + dAPer + "]";
	}
	
	
	
	
	
	

}

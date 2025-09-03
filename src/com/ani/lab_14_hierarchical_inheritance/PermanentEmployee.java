package com.ani.lab_14_hierarchical_inheritance;

public class PermanentEmployee extends Employee 
{
	protected double providentfund;

	public PermanentEmployee(int employeeId, String employeeName, double employeeSalary) 
	{
		super(employeeId, employeeName, employeeSalary);
	}
	
	{
        this.providentfund = super.employeeSalary * 0.12;
    }

	@Override
	public String toString() 
	{
		return "PermanentEmployee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeSalary="
				+ employeeSalary + ", providentfund=" + providentfund + "]";
	}
	
	
	public void netSalary()
	{
		double netSal = employeeSalary + providentfund;
		System.out.println("Net Salary is :"+netSal);
	}
	
	
}

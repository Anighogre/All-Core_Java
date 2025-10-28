package com.ani.single_level_inheritance;

public class PermamentEmployee extends TemporaryEmployee 
{
	protected String department;
	protected String designation;
	
	public PermamentEmployee(int employeeId, String employeeName, double employeeSalary,String department, String designation)
	{
		super(employeeId, employeeName, employeeSalary);
		this.department = department;
		this.designation = department;
	}

	@Override
	public String toString() 
	{
		return "PermamentEmployee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeSalary="
				+ employeeSalary + ", department=" + department + ", designation=" + designation + "]";

	}
}

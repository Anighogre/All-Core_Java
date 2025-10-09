package com.ani.lab_30_jul;

public class Employee {

	private int employeeNumber;
	private String employeeName;
	private double employeeSalary;
	
	public static String companyName = "NIT";
	
	// this is a method
//	public void setEmployeeDetails(int employeeNumber, String employeeName, double employeeSalary)
//	{
//		this.employeeNumber = employeeNumber;
//		this.employeeName = employeeName;
//		this.employeeSalary = employeeSalary;
//	}
	
	
	// it is a constructor we dont need to create another method or call the method seperately we just pass the values inside the object 
	public Employee(int employeeNumber, String employeeName, double employeeSalary) {
		super();
		this.employeeNumber = employeeNumber;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
	}
	
	
	public void calculateSalaryIncrement()
	{
		if(employeeSalary < 50000)
		{
			double inc  = employeeSalary * 0.10;
			System.out.printf("Increment Amount :%.2f\n", inc);
			employeeSalary = inc + employeeSalary;
			System.out.println("After Increment Amount :"+employeeSalary);
		} 
		else if(employeeSalary >= 50000 && employeeSalary < 80000)
		{
			double inc  = employeeSalary * 0.07;
			System.out.printf("Increment Amount :%.2f\n", inc);
			employeeSalary = inc + employeeSalary;
			System.out.println("After Increment Amount :"+employeeSalary);
		} 
		else if(employeeSalary > 80000)
		{
			double inc  = employeeSalary * 0.05;
			System.out.printf("Increment Amount :%.2f\n" ,inc);
			employeeSalary = inc + employeeSalary;
			System.out.println("After Increment Amount :"+employeeSalary);
		}
	}
	
	
//	public void getEmployeeDetails()
//	{
//		System.out.println("Employee Number :"+employeeNumber);
//		System.out.println("Employee Name :"+employeeName);
//		System.out.println("Updated salary  :"+employeeSalary);
//	}
	
	
	// create toString methot to print the all data it return type is string 
		@Override
		public String toString() {
			return "Employee [employeeNumber=" + employeeNumber + ", employeeName=" + employeeName + ", employeeSalary="
					+ employeeSalary + ", companyName ="+ companyName + "]";
		}
		
	
}

package com.ani.lab_30_jul;

import java.util.Scanner;

public class EmployeeDemo 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the Employee number :");
		int number = Integer.parseInt(sc.nextLine());
		
		System.out.print("Enter the Employee name :");
		String name = sc.nextLine();
		
		System.out.print("Enter Employee Salery :");
		double salary = sc.nextDouble();
		
		
//		Employee e1 = new Employee();
		
		Employee e1 = new Employee(number, name, salary);
		
//		e1.setEmployeeDetails(number, name, salary);
//		e1.getEmployeeDetails();
		System.out.println(e1);
		e1.calculateSalaryIncrement();
		sc.close();
	}
}

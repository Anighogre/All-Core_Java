package com.ani.lab_1_aug_constructor;

import java.util.Scanner;

public class EmployeeDemo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Employee Number :");
		int number = Integer.parseInt(sc.nextLine());
		
		System.out.print("Enter Employee Name :");
		String name = sc.nextLine();
		
		System.out.print("Enter Employee Salary :");
		double salary = Double.parseDouble(sc.nextLine());
		
		Employee e1 = new Employee(number,name,salary);
		
		
		System.out.println("Employee Number: "+e1.getEmployeeNumber());
		System.out.println("Employee Name: "+e1.getEmployeeName());
		System.out.println("Employee Salary: "+e1.getEmployeeSalary());
		e1.setEMployeeDetails();

	}

}

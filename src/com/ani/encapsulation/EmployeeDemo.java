package com.ani.encapsulation;

import java.util.Scanner;

public class EmployeeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee scott = new Employee(1001,"Mr scott",65000);
		System.out.println(scott);
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter increment amount :");
		double amount = Double.parseDouble(sc.nextLine());
		
		scott.setEmployeeSalary(scott.getEmployeeSalary() + amount);
		System.out.println(scott);
		
		sc.close();
	}

}

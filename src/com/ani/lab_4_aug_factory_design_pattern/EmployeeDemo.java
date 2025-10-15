package com.ani.lab_4_aug_factory_design_pattern;

import java.util.Scanner;

public class EmployeeDemo {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the no of objects :");
		int noOfObj = sc.nextInt();
		
		for(int i=1; i<=noOfObj; i++)
		{
			Employee e1 = Employee.createEmployeeObject();
			System.out.println(e1);
			System.out.println("Annual Salary (with Bonus): "+ e1.calculateAnnualSalary());
		}
		sc.close();
	}

}

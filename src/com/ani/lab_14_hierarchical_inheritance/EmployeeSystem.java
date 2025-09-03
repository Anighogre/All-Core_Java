package com.ani.lab_14_hierarchical_inheritance;

import java.util.Scanner;

public class EmployeeSystem {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter permanent employee Id :");
		int empId = Integer.parseInt(sc.nextLine());
		
		System.out.print("Enter permanent employee Name :");
		String empName = sc.nextLine();
		
		System.out.print("Enter permanent employee Salary :");
		double empSal = Double.parseDouble(sc.nextLine());
		
		PermanentEmployee p1 = new PermanentEmployee(empId, empName, empSal);
		System.out.println(p1);
		p1.netSalary();
		
		
		System.out.println("========================================");
		
		System.out.print("Enter contract employee Id :");
		int cEmpId = Integer.parseInt(sc.nextLine());
		
		System.out.print("Enter contract employee Name :");
		String cEmpName = sc.nextLine();
		
		System.out.print("Enter contract employee Salary :");
		double cEmpSal = Double.parseDouble(sc.nextLine());
		
		System.out.print("Enter contract duration in year :");
		int cEmpYear = Integer.parseInt(sc.nextLine());
		
		ContractEmployee e1 = new ContractEmployee(cEmpId, cEmpName, cEmpSal, cEmpYear);
		System.out.println(e1);
	}

}

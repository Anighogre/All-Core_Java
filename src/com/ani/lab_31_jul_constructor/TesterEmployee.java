package com.ani.lab_31_jul_constructor;

import java.util.Scanner;

public class TesterEmployee {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("FirstName :");
		String fName = sc.nextLine();
		
		System.out.print("LastName :");
		String lName = sc.nextLine();
		
		System.out.print("EmployeeId :");
		int id = Integer.parseInt(sc.nextLine());
		
		System.out.print("Salary :");
		double salary = Double.parseDouble(sc.nextLine());
		
		System.out.print("No. Of Prijects :");
		int project = Integer.parseInt(sc.nextLine());
		
		Employee e1 = new Employee(fName,lName,id,salary,project);
		
		System.out.println(e1);
		
		e1.calculateSalary();
		

	}

}

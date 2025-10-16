package com.ani.lab_6_aug_pass_by_obj_value;

import java.util.Scanner;

public class TaxCalculation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter details for EMployee :");
		System.out.print("Enter the emp id :");
		int id = Integer.parseInt(sc.nextLine());
		
		System.out.print("Enter emp name :");
		String name = sc.nextLine();
		
		System.out.print("Enter emp basic salary :");
		double sal = Double.parseDouble(sc.nextLine());
		
		System.out.print("Enter house rent per year :");
		double rentHRA = Double.parseDouble(sc.nextLine());
		
		System.out.print("Enter house rent per day :");
		double rentDA = Double.parseDouble(sc.nextLine());
		
		
		Employee e1 = new Employee(id, name, sal, rentHRA, rentDA);
		System.out.println(e1);
		
		TaxUtil t1 = new TaxUtil();
		System.out.println("Tax after calculating Gross Salary :"+t1.calculateTax(e1));
		
		System.out.println();
		System.out.println("=======================================================================================================");
		System.out.println();
		
		System.out.println("Enter details for Manager :");
		System.out.print("Enter the manager id :");
		int mId = Integer.parseInt(sc.nextLine());
		
		System.out.print("Enter manager name :");
		String mName = sc.nextLine();
		
		System.out.print("Enter manager basic salary :");
		double mSal = Double.parseDouble(sc.nextLine());
		
		System.out.print("Enter house rent per year :");
		double mRentHRA = Double.parseDouble(sc.nextLine());
		
		System.out.print("Enter house rent per day :");
		double mRentDA = Double.parseDouble(sc.nextLine());
		
		System.out.print("Enter projectAllowance price :");
		double projectAllowance = Double.parseDouble(sc.nextLine());
		
		Manager m1 = new Manager(mId, mName, mSal, mRentHRA, mRentDA, projectAllowance);
		System.out.println(m1);
		System.out.println("Tax after calculating Gross Salary :"+t1.calculateTax(m1));
		
		System.out.println();
		System.out.println("=======================================================================================================");
		System.out.println();
		
		
		System.out.println("Enter details for Trainer :");
		System.out.print("Enter the trainer id :");
		int tId = Integer.parseInt(sc.nextLine());
		
		System.out.print("Enter trainer name :");
		String tName = sc.nextLine();
		
		System.out.print("Enter trainer basic salary :");
		double tSal = Double.parseDouble(sc.nextLine());
		
		System.out.print("Enter house rent per year :");
		double tRentHRA = Double.parseDouble(sc.nextLine());
		
		System.out.print("Enter house rent per day :");
		double tRentDA = Double.parseDouble(sc.nextLine());
		
		System.out.print("Enter No. of batch count :");
		int pCount = Integer.parseInt(sc.nextLine());
		
		System.out.print("Enter percentage per batch :");
		double perkPerBatch = Double.parseDouble(sc.nextLine());
		
		Trainer tr1 = new Trainer(tId, tName, tSal, tRentHRA, tRentDA, pCount,perkPerBatch);
		System.out.println(tr1);
		System.out.println("Tax after calculating Gross Salary :"+t1.calculateTax(tr1));
		
		System.out.println();
		System.out.println("=======================================================================================================");
		System.out.println();
		
		
		
		System.out.println("Enter details for Sourcing :");
		System.out.print("Enter the source id :");
		int sId = Integer.parseInt(sc.nextLine());
		
		System.out.print("Enter source name :");
		String sName = sc.nextLine();
		
		System.out.print("Enter source basic salary :");
		double sSal = Double.parseDouble(sc.nextLine());
		
		System.out.print("Enter house rent per year :");
		double sRentHRA = Double.parseDouble(sc.nextLine());
		
		System.out.print("Enter house rent per day :");
		double sRentDA = Double.parseDouble(sc.nextLine());
		
		System.out.print("Enter enrollmentTarget :");
		int enrollmentTarget = Integer.parseInt(sc.nextLine());
		
		System.out.print("Enter enrollmentReached :");
		int enrollmentReached = Integer.parseInt(sc.nextLine());
		
		System.out.print("Enter percentage Per Enrollment :");
		double perkPerEnrollment = Double.parseDouble(sc.nextLine());
		
		Sourcing s1 = new Sourcing(sId, sName, sSal, sRentHRA, sRentDA, enrollmentTarget,enrollmentReached, perkPerEnrollment);
		System.out.println(s1);
		System.out.println("Tax after calculating Gross Salary :"+t1.calculateTax(s1));
		
		sc.close();
	}

}

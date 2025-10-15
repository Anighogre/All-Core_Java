package com.ani.lab_4_aug_factory_design_pattern;

import java.util.Scanner;

import com.ani.factory_design_pattern.Product;

public class StudentDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of objects :");
		int noOfObj = sc.nextInt();
		
		for(int i=1; i<=noOfObj; i++)
		{
			Student s1 = Student.createStudentObject();
			System.out.println(s1);
		}
		sc.close();

	}

}

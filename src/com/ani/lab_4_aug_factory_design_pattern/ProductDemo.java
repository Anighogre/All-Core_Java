package com.ani.lab_4_aug_factory_design_pattern;

import java.util.Scanner;

public class ProductDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the no of objects :");
		int noOfObj = sc.nextInt();
		
		for(int i=1; i<=noOfObj; i++)
		{
			System.out.println("Enter details for Product "+i+":");
			Product p1 = Product.createProductObject();
			System.out.println(p1);
			System.out.println("Total Amount (after discount):"+p1.calculateTotalAmount());
		}
		sc.close();

	}

}

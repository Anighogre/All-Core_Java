package com.ani.factory_design_pattern;

import java.util.Scanner;

public class ProductDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of objects :");
		int noOfObj = sc.nextInt();
		
		for(int i=1; i<=noOfObj; i++)
		{
			Product p1 = Product.getProductObject();
			System.out.println(p1);
		}
		sc.close();
		
	}

}

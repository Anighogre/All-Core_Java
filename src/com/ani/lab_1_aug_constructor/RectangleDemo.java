package com.ani.lab_1_aug_constructor;

import java.util.Scanner;

public class RectangleDemo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the width of rectangle :");
		double width = Double.parseDouble(sc.nextLine());
		
		System.out.print("Enter the height of recatngle :");
		double height = Double.parseDouble(sc.nextLine());
		
		Rectangle r1 = new Rectangle(width,height);
		
		
		System.out.println("Area: "+r1.getArea());
		System.out.println("Perimeter: "+r1.getPerimeter());
	
	}
	

}

package com.ani.lab_31_jul_constructor;

import java.util.Scanner;

public class BookDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.print("Title :");
		String title = sc.nextLine();
		
		System.out.print("Author Name :");
		String author = sc.nextLine();
		
		System.out.print("Price :");
		double price = Double.parseDouble(sc.nextLine());
		
		System.out.println("discountPercentage :");
		double discountPercentage = Double.parseDouble(sc.nextLine());

		Book b1 = new Book(title,author,price);
		System.out.println(b1);
		
		
		
		b1.applyDiscount(discountPercentage);
		
	
		

	}

}

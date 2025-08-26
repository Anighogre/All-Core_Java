package com.ani.deep_copy;

public class ProductDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Product p1 = new Product(23000);
		System.out.println(p1); // 23000
		
		Product p2 = new Product();
		System.out.println(p2); // 0.0
		
		p2.setPrice(p1.getPrice());
		System.out.println(p2); // 23000
		
		p1.setPrice(30000);
		System.out.println(p1); // 30000
		System.out.println(p2); // 23000

	}

}

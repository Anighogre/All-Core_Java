package com.ani.passing_obj_ref;

public class ProductDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Product p1 = new Product(111,"Scott");
		System.out.println(p1);
		
		Product p2 = new Product(p1);
		System.out.println(p2);

	}

}

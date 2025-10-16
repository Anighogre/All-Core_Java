package com.ani.lab_this_key;

public class ProductDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Product p1 = new Product(120,"HP",34000);
		Product p1 = new Product();
		
		p1.setProductData(120, "HP", 34000);
		p1.getProductData();
	}
	

}

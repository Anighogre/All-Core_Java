package com.ani.blank_final_field;

/*
 * A blank final field must be initialized by developer explicitly till object creation
 * that means till constructor body execution 
 * in the following two places
 * 1. inside non static block
 * 2. inside constructor boy
 */


class Product{
	final double price; // blank final field

	{
		price = 20000;
	}
	
	public Product()
	{
		// price = 25000; //[final so,one time initialization]
	}

}

public class BankFinalDemo3 {

	public static void main(String[] args) {
		Product p1 = new Product();
		System.out.println(p1.price);

	}

}

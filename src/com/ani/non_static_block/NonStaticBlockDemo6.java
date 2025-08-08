package com.ani.non_static_block;

/*
 * If a class contain multiple non static blocks then it will executed according to
 * the order [top to bottom]
 */

class Customer
{
	private double balance;
	
	// No argument Constructor
	public Customer()
	{
		balance = 4000;
		System.out.println("Current balance is :"+this.balance);// 4
	}
	
	// Non static block
	{
		balance = 1000;
		System.out.println("Current balance is :"+this.balance);// 1
	}
	
	{
		balance = 2000;
		System.out.println("Current balance is :"+this.balance);// 2
	}
	
	{
		balance = 3000;
		System.out.println("Current balance is :"+this.balance);// 3
	}
}

public class NonStaticBlockDemo6 
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new Customer();

	}

}

package com.ani.heap_stack;

public class CustomerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int val = 100;
		
		Customer c1 = new Customer("Ani",2);
		
		m1(c1);
		
		System.out.println(c1.getId());
	}
	
	public static void m1(Customer cust)
	{
		cust.setId(5);
		cust = new Customer("Akki",7);
		
		cust.setId(9);
		System.out.println(cust.getId());
	}

}

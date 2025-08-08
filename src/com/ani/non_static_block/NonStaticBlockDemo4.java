package com.ani.non_static_block;

/*
 * conclusion is if constructor 1st line is containing super() then second line if
 * guaranteed reserved for non static block[if available] 
 */

class Foo{
	
	public Foo()
	{
		super();
		System.out.println("No argument Constructor");// 2
	}
	
	public Foo(String message)
	{
		super();
		System.out.println("Parameterized Constructor :"+message);// 4
	}
	
	// Non static block
	{
		System.out.println("Non static block");// 1  3
	}
}

public class NonStaticBlockDemo4 
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new Foo();
		new Foo("Hello everryone");

	}

}

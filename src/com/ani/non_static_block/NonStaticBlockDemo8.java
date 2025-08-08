package com.ani.non_static_block;

/*
 * we can't any return statement inside non static block because
 * non static block must be executed normally
 */

public class NonStaticBlockDemo8 
{
	{
		System.out.println("NSB in ELC class");
		//return; // error
	}
	
	public static void main(String[] args) 
	{

	}

}

package com.ani.non_static_block;

/*
 * If a user explicitly writes non static block inside constructor body then
 * it will be executed as it is
 */

class NIT{
	
	// No argument constructor
	public NIT()
	{
		System.out.println("No argument constructor");// 1
		
		// non static block
		{
			System.out.println("Non static block");// 2
		}
	}
}

public class NonStaticBlockDemo7 
{
	public static void main(String[] args) 
	{
		new NIT();
	}

}

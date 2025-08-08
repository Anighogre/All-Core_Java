package com.ani.non_static_block;

/*
 * it is a special block in java which is automatically execute at the time of creating the object 
 * that means every time we will create an object non static block will be executed
 */


class Test{
	{
		System.out.println("Non static block");
	}
}

public class NonStaticBlockDemo1 
{
	public static void main(String[]args)
	{
		new Test();
		new Test();
		new Test();
	}
}

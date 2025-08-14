package com.ani.constructor_chaning;

/*
 * case2:
 * 		super("NIT"):it must be explicitly written by developer. it is used to invoke 
 *      parameterized constructor of super class where super class parameterized
 *      constructor must be accept a single parameter of type string 
 */

class Alpha1
{
	public Alpha1(String name)
	{
		super();
		System.out.println("Institite name is :"+name);
	}
}

class Beta1 extends Alpha1
{
	public Beta1()
	{
		super("NIT");
		System.out.println("No argument constructor of beta class");
	}
}

public class ConstructorChaningDemo3 
{
	public static void main(String[] args) 
	{
		new Beta1();
	}

}

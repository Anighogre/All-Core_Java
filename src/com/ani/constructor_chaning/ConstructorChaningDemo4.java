package com.ani.constructor_chaning;

/*
 * case3:
 * 		this():It must be explicitly written by developer to the first 
 *      line of constructor. It is used to call no argument constructor 
 *      of same class(current class)
 *      NOTE: this() and super() will only work to the first line of constructor not a method
 */

class Super
{
	public Super()
	{
		super();
		System.out.println("No argumnet constructor of supper class!!");
	}
	
	public Super(int val)
	{
		this();
		System.out.println("Parameterized constructor of super class "+val);
	}
}

class Sub extends Super
{
	public Sub(int data)
	{
		super(data);
		System.out.println("No argument constructor of sub class");
	}
}


public class ConstructorChaningDemo4
{
	public static void main(String[] args)
	{
		new Sub(10);
	}

}

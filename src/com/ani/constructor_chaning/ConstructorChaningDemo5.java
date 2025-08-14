package com.ani.constructor_chaning;

/*
 * this("Java"): It must be explicitly written by developer. 
 *           It is used to call parameterized constructor of the current class
 *           where parameterized constructor must accept one parameter of type string 
 */

class Base
{
	public Base()
	{
		this("Java");
		System.out.println("No argument constructor of base class");
	}
	
	public Base(String lang)
	{
		System.out.println("Most secured langaugge :"+lang);
	}
}

class Derived extends Base
{
	public Derived()
	{
		System.out.println("No argument constructor of derived class");
	}
}



public class ConstructorChaningDemo5 
{
	public static void main(String[] args)
	{
		new Derived();
	}

}

package com.ani.constructor_chaning;

/*
 * program that describe default no argument constructor and super() 
 * is automatically added by java compiler
 */

class A
{
	A()
	{
		System.out.println("A");
	}
}

class B extends A
{
}

class C extends B
{
	C()
	{
		System.out.println("C");
	}
}

public class ConstructorChaningDemo2 
{
	public static void main(String[] args) 
	{
		new C();
	}

}

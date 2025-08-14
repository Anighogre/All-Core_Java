package com.ani.constructor_chaning;

/*
 * in order to call the constructor of super class as well as same class
 * we have total 4 cases
 * case1: super(): automatically added by compiler to maintain the hierarchy in 
 *              the first line of the constructor. It is used to call default or no argument
 *              constructor of super class 
 */

class Alpha
{
	public Alpha()
	{
		System.out.println("Alpha class no argument constructor!!");
	}
}

class Beta extends Alpha
{
	public Beta()
	{
		System.out.println("Beta class no argument constructor!!");
	}
}

class Gamma extends Beta
{
	public Gamma()
	{
		System.out.println("Gamma class no argument constructor!!");
	}
}

public class ConstructorChaningDemo1 
{
	public static void main(String []args)
	{
		new Gamma();
	}
}

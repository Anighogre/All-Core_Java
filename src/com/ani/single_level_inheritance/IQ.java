package com.ani.single_level_inheritance;

class Alpha
{
	public Alpha()
	{
//		super();
		System.out.println("alpha class constructor"); // 4
	}
	
	// non static block
	{
		System.out.println("Non static block of alpha class"); // 1
	}
	
	Beta b = new Beta(); // 2

	class Beta
	{
		public Beta()
		{
			System.out.println("No argument constructor of beta class"); // 3
		}
	}
	
}

public class IQ {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		new Alpha();

	}

}

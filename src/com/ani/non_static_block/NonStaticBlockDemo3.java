package com.ani.non_static_block;

class Sample
{
	// No argument constructor
	public Sample()
	{
		this("java");
		System.out.println("No argument constructor"); // 3
	}
	
	// constructor overloading
	public Sample(String language)
	{
		System.out.println("Language is :"+language); // 2
	}
	
	// Non static block
	{
		System.out.println("Non static block"); // 1
	}
}

public class NonStaticBlockDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new Sample();

	}

}

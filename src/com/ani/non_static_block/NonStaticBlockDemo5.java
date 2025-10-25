package com.ani.non_static_block;

/*
 * The main purpose of non static block to initialize the non static field that is that is the 
 * reason it is also known as instance initializer as well as if we want to provide 
 * common message/logic for all objects then we should use non static block
 */

class Simple
{
	int data;
	
	// non static block
	{
		data = 500;
		System.out.println("Object creation is in progress");
		System.out.println(data);


	}
}


public class NonStaticBlockDemo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Simple s1 = new Simple();
//		System.out.println(s1.data);
		
		Simple s2 = new Simple();
//		System.out.println(s2.data);
	}

}

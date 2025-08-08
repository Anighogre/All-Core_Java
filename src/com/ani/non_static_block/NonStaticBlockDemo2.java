package com.ani.non_static_block;

/*
 * The first line of any constructor is reserved to call either same class constructor
 * by using this() OR parent class constructor by using super()

 * If the class contain non static block and if the constructor first line contains super(), 
 * not this() then the 2nd line of constructor will be reserved for non static block  
 */



class Demo{
	public Demo(){
		System.out.println("No argunent constructor"); // then this 3rd line executed 
	}
	
	{
		System.out.println("Non static block"); // first this non static block will be executed as a second line of constructor 
	}
}

public class NonStaticBlockDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new Demo();

	}

}

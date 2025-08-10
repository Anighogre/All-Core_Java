package com.ani.blank_final_field;

/*
 * A blank final field default value is provided by new keyword but the same 
 * value will not be copied by default constructor
 */

class Test{
	final int A;
	
	{
		printValue();
		A = 100;
	}
	
	public void printValue()
	{
		System.out.println("Defalut value :"+this.A);
	}
}

public class BankFinalDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t1 = new Test();
		System.out.println("User value :"+t1.A);

	}

}

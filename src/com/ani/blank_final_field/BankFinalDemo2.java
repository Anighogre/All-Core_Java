package com.ani.blank_final_field;

/*
 * A blank final field cannot be initialized inside the method body
 * 
 */

class LIC1{
	//final double installment; // Blank final field (error)
	
	public void getInstallment()
	{
		//installment = 20000.0; // error
	}
}

public class BankFinalDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LIC1 i = new LIC1();
		i.getClass();
		//System.out.println(i.installment);

	}

}

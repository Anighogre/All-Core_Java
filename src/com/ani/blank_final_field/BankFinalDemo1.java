package com.ani.blank_final_field;

/*
 * A blank final field cannot be initialized(cannot copy the value provided by new keyword)
 * in default no argument constructor
 */

class LIC{
	//final double installment; // Blank final field (error)
}

public class BankFinalDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LIC i = new LIC();
		//System.out.println(i.installment);

	}

}

package com.ani.data_hiding;

public class Customer {
	private double balance = 10000; // Data hiding
	
	public void deposit(int amount)
	{
		if(amount < 0)
		{
			System.err.println("Amount can't be deposited!!!");
		}else {
			balance = balance+amount;
			System.out.println("Balance after deposit is :"+balance);
		}
	}
	
	public void withdraw(int amount)
	{
		if(amount > balance)
		{
			System.err.println("Insuffecient balance!!!");
		} else {
			balance = balance - amount;
			System.out.println("Balance after withdraw is :"+balance);
		}
	}

}

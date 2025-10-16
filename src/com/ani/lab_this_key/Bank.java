package com.ani.lab_this_key;

public class Bank {
	private String customerName;
	private int accountNumber;
	private double currentBalance;
	
	public static String bankName = "SBI";
	public static String bankAddress = "Ameerpet HYD";
	public static String bankIFSCCode = "SBI1209HYD";
	
	
	public void setCustomerDeatils(String name, int accNumber, double balance)
	{
		customerName = name;
		accountNumber = accNumber;
		currentBalance = balance;
	}
	
	public void withdraw(double amount)
	{
		if(amount > currentBalance)
		{
			System.err.println("You have insufficient balance!!!");
		} else 
		{
			currentBalance = currentBalance + amount;
		}
	}

	public void deposit(double amount1)
	{
		if(amount1 <= 0)
		{
			System.err.println("Can't deposite this amount enter valid amount!!!");
		} else {
			currentBalance = currentBalance - amount1;
		}
	}
	
	
	public void currentBalance()
	{
		System.out.println("Current Balance is :"+currentBalance);
	}

	@Override
	public String toString() {
		return "Bank [customerName=" + customerName + ", accountNumber=" + accountNumber + ", bankName="+ bankName + ", bankAddress="+ 
				bankAddress +", bankIFSCCode="+ bankIFSCCode  + "]";
	}
	
	
}

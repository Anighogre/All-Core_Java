package com.ani.lab_this_key;

import java.util.Scanner;

public class BankCustomer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the customer name :");
		String name = sc.nextLine();
		
		System.out.print("Enter the customer account Number :");
		int accNumber = sc.nextInt();
		
		System.out.print("Enter the current Balance :");
		double balance = sc.nextDouble();
		
		Bank b1 = new Bank();
		
		b1.setCustomerDeatils(name, accNumber, balance);
		
		System.out.print("Enter 1 for withdraw and 2 for deposit :");
		int n = sc.nextInt();
		
		if(n==1) 
		{
			System.out.print("Enter the withdraw amount :");
			double amount = sc.nextDouble();
			b1.withdraw(amount);
		} 
		else if(n==2)
		{
			System.out.print("Enter the deposit Amount :");
			double amount1 = sc.nextDouble();
			b1.deposit(amount1);
		} else System.err.println("Enter the valid input!!!");
		
		
		b1.currentBalance();
		System.out.println(b1);
//		b1.displayDetails(b1);
	}
}

package com.ani.credit_card_program;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Customer Name :");
		String name = sc.nextLine();
		
		System.out.print("Enter your Credit Points :");
		int cPoints = Integer.parseInt(sc.nextLine());
		
		Customer c1 = new Customer(name, cPoints);
//		CardType offeredCard
		System.out.println(CardsOnOffer.getOfferedCard(c1));
		
		sc.close();

	}

}

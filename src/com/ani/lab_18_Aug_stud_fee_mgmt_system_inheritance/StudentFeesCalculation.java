package com.ani.lab_18_Aug_stud_fee_mgmt_system_inheritance;

import java.util.Scanner;

public class StudentFeesCalculation 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Select a particular type of Student : \n1) Hosteller Student :\r\n"
				+ "2) DayScholer Student :");
		int n = Integer.parseInt(sc.nextLine());
		
		switch(n)
		{
		case 1 -> {
			System.out.println("You have selected Hosteller!!!");
			System.out.print("Enter Student Id :");
			int stdId = Integer.parseInt(sc.nextLine());
			
			System.out.print("Enter Student Name :");
			String stdName = sc.nextLine();
			
			System.out.print("Enter Exam Fees :");
			double examFee = Double.parseDouble(sc.nextLine());
			
			System.out.print("Enter Hostel Fee :");
			double hostelFee = Double.parseDouble(sc.nextLine());
			
			System.out.print("Enter your total Fees :");
			double totlFee = Double.parseDouble(sc.nextLine());
			
			Hosteller h1 = new Hosteller(stdId, stdName, examFee, hostelFee);
			double payFees = h1.payFee(totlFee);
			
			if(payFees < 0)
			{
				System.out.println("Refundabale Amount is :"+payFees);
			} else {
				System.out.println("Payable Amount is :"+payFees);
			}
			
			System.out.println(h1);
		}
			
			case 2 ->{
				System.out.println("You have selected Day Scholler!!!");
				System.out.print("Enter Student Id :");
				int stdId = Integer.parseInt(sc.nextLine());
				
				System.out.print("Enter Student Name :");
				String stdName = sc.nextLine();
				
				System.out.print("Enter Exam Fees :");
				double examFee = Double.parseDouble(sc.nextLine());
				
				System.out.print("Enter Transport Fee :");
				double transportFee = Double.parseDouble(sc.nextLine());
				
				System.out.print("Enter your total Fees :");
				double totlFee = Double.parseDouble(sc.nextLine());
				
				DayScholar d1 = new DayScholar(stdId, stdName, examFee, transportFee);
				double payFees = d1.payFee(totlFee);
				
				if(payFees < 0)
				{
					System.out.println("Refundabale Amount is :"+payFees);
				}else {
					System.out.println("Payable Amount is :"+payFees);
				}
				System.out.println(d1);
			}
		
		}
		sc.close();

	}

}

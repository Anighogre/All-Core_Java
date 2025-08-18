package com.ani.lab_18_Aug_stud_fee_mgmt_system_inheritance;

public class Hosteller extends Student 
{
	protected double hostelFee;

	public Hosteller(int studentId, String name, double examFee, double hostelFee) 
	{
		super(studentId, name, examFee);
		
		if(hostelFee <0)
		{
			System.err.println("hostel fees cannot be negative");
			System.exit(0);
		}
		
		this.hostelFee = hostelFee;
	}

	@Override
	public String toString() 
	{
		return "Hosteller [studentId=" + studentId + ", name=" + name + ", examFee=" + examFee + ", hostelFee="
				+ hostelFee + "]";
	}
	
	public double payFee(double amount)
	{
		double total = this.examFee + this.hostelFee;
		
		if(amount>total)
		{
//			System.out.print("Refundabale Amount is :");
			return total-amount;
		} else 
		{
			return total-amount;
		}
	}
	
}

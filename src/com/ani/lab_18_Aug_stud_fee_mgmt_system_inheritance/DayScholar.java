package com.ani.lab_18_Aug_stud_fee_mgmt_system_inheritance;

public class DayScholar extends Student 
{
	protected double transportFee;
	
	public DayScholar(int studentId, String name,double examFee,double transportFee)
	{
		super(studentId,name,examFee);
		
		if(transportFee <0)
		{
			System.err.println("transport fees cannot be negative");
			System.exit(0);
		}
		
		this.transportFee = transportFee;
	}

	@Override
	public String toString() 
	{
		return "DayScholar [studentId=" + studentId + ", name=" + name + ", examFee=" + examFee + ", transportFee="
				+ transportFee + "]";
	}
	
	public double payFee(double amount)
	{
		double total = this.examFee+this.transportFee;
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

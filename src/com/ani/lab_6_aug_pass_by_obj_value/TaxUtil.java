package com.ani.lab_6_aug_pass_by_obj_value;

public class TaxUtil {
	
	public double calculateTax(Employee e)
	{
		double sal = e.calculateGrossSalary();
		if( sal> 500000)
		{
			return sal*0.20;
		} else {
			return sal*0.05;
		}
	}

	public double calculateTax(Manager m)
	{
		double sal = m.calculateGrossSalary();
		if( sal> 500000)
		{
			return sal*0.20;
		} else {
			return sal*0.05;
		}
	}
	
	public double calculateTax(Trainer t)
	{
		double sal = t.calculateGrossSalary();
		if( sal> 500000)
		{
			return sal*0.20;
		} else {
			return sal*0.05;
		}
	}
	
	public double calculateTax(Sourcing s)
	{
		double sal = s.calculateGrossSalary();
		if( sal> 500000)
		{
			return sal*0.20;
		} else {
			return sal*0.05;
		}
	}
	
}

package com.ani.lab_6_aug_pass_by_obj_value;

public class Manager 
{
	private int managerId;
	private String managerName;
	private double basicSalary;
	private double hRAPer;
	private double dAPer;
	private double projectAllowance;
	
	public Manager(int managerId, String managerName, double basicSalary, double hRAPer, double dAPer,
			double projectAllowance) 
	{
		super();
		this.managerId = managerId;
		this.managerName = managerName;
		this.basicSalary = basicSalary;
		this.hRAPer = hRAPer;
		this.dAPer = dAPer;
		this.projectAllowance = projectAllowance;
	}
	
	public double calculateGrossSalary()
	{
		double grossSalary = this.basicSalary + this.hRAPer + this.dAPer + this.projectAllowance;
		return grossSalary;
	}

	@Override
	public String toString() 
	{
		return "Manager [managerId=" + managerId + ", managerName=" + managerName + ", basicSalary=" + basicSalary
				+ ", hRAPer=" + hRAPer + ", dAPer=" + dAPer + ", projectAllowance=" + projectAllowance + "]";
	}
	
	
	
	
}


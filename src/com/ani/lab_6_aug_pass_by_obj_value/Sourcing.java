package com.ani.lab_6_aug_pass_by_obj_value;

public class Sourcing 
{
	private int sourceId;
	private String sourcaName;
	private double basicSalary;
	private double hRAPer;
	private double dAPer;
	private int enrollmentTarget;
	private int enrollmentReached;
	private double perkPerEnrollment;
	
	public Sourcing(int sourceId, String sourcaName, double basicSalary, double hRAPer, double dAPer,
			int enrollmentTarget, int enrollmentReached, double perkPerEnrollment) 
	{
		super();
		this.sourceId = sourceId;
		this.sourcaName = sourcaName;
		this.basicSalary = basicSalary;
		this.hRAPer = hRAPer;
		this.dAPer = dAPer;
		this.enrollmentTarget = enrollmentTarget;
		this.enrollmentReached = enrollmentReached;
		this.perkPerEnrollment = perkPerEnrollment;
	}
	
	public double calculateGrossSalary()
	{
		return this.basicSalary + this.hRAPer + this.dAPer +(((this.enrollmentReached/this.enrollmentTarget)*100)*this.perkPerEnrollment);
	}

	@Override
	public String toString() 
	{
		return "Sourcing [sourceId=" + sourceId + ", sourcaName=" + sourcaName + ", basicSalary=" + basicSalary
				+ ", hRAPer=" + hRAPer + ", dAPer=" + dAPer + ", enrollmentTarget=" + enrollmentTarget
				+ ", enrollmentReached=" + enrollmentReached + ", perkPerEnrollment=" + perkPerEnrollment + "]";
	}
	
	
	
	
}

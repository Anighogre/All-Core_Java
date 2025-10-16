package com.ani.lab_6_aug_pass_by_obj_value;

public class Trainer 
{
	private int trainerId;
	private String trainerName;
	private double basicSalary;
	private double hRAPer;
	private double dAPer;
	private int batchCount;
	private double perkPerBatch;
	
	public Trainer(int trainerId, String trainerName, double basicSalary, double hRAPer, double dAPer, int batchCount,
			double perkPerBatch) 
	{
		super();
		this.trainerId = trainerId;
		this.trainerName = trainerName;
		this.basicSalary = basicSalary;
		this.hRAPer = hRAPer;
		this.dAPer = dAPer;
		this.batchCount = batchCount;
		this.perkPerBatch = perkPerBatch;
	}
	
	public double calculateGrossSalary()
	{
		return this.basicSalary + this.hRAPer + this.dAPer +(this.batchCount * this.perkPerBatch);
	}

	@Override
	public String toString() 
	{
		return "Trainer [trainerId=" + trainerId + ", trainerName=" + trainerName + ", basicSalary=" + basicSalary
				+ ", hRAPer=" + hRAPer + ", dAPer=" + dAPer + ", batchCount=" + batchCount + ", perkPerBatch="
				+ perkPerBatch + "]";
	}
	
	
	
	

}

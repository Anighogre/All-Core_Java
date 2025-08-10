package com.ani.blank_final_field;

/*
 * initializing inside the non static block
 */

class Employee{
	private final String jobTitle;
	
	{
		jobTitle = "AI Engineer";
	}
	
	public Employee()
	{
		
	}
	
	public Employee(String jobTitle)
	{
		
	}
	
	public String getJobTitle()
	{
		return jobTitle;
	}
}


public class BankFinalDemo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee raj = new Employee();
		System.out.println(raj.getJobTitle());
		
		Employee ravi = new Employee("Software engineer");
		System.out.println(ravi.getJobTitle());
		

	}

}

package com.ani.blank_final_field;

/*
 * A blank final field must be initialized by all the constructors available in the class
 */

class Student{
	private final String jobTitle;
	
	public Student()
	{
		jobTitle = "IT developer";
	}
	
	public Student(String jobTitle)
	{
		this.jobTitle = jobTitle;
	}
	
	public String getJobTitle()
	{
		return jobTitle;
	}
}


public class BankFinalDemo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student raj = new Student();
		System.out.println(raj.getJobTitle());
		
		Student ravi = new Student("Software engineer");
		System.out.println(ravi.getJobTitle());

	}

}

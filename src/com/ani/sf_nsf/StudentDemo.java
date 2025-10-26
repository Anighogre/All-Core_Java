package com.ani.sf_nsf;

public class StudentDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student();
		s1.setStudentInfo(101, "Ani", "Hyd");
		s1.getStudentInfo();

		System.out.println("=====================================");
		
		Student s2 = new Student();
		s2.setStudentInfo(102, "Akki", "Pune");
		s2.getStudentInfo();

		System.out.println("=====================================");
		
		Student s3 = new Student();
		s3.setStudentInfo(103, "Vaibhav", "Hyd");
		s3.getStudentInfo();

	}

}

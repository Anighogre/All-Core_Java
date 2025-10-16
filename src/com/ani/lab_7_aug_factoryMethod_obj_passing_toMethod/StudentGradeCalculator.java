package com.ani.lab_7_aug_factoryMethod_obj_passing_toMethod;

import java.util.Scanner;

public class StudentGradeCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter student name :");
		String name = sc.nextLine();
		
		System.out.print("Enter student marks :");
		int marks = Integer.parseInt(sc.nextLine());
		
		
		Student s1 = new Student(name, marks);
		
		System.out.println(CalculateStudentGrade.calculateGrade(s1));

	}

}

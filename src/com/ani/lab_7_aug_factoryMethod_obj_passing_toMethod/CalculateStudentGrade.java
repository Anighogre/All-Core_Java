package com.ani.lab_7_aug_factoryMethod_obj_passing_toMethod;

public class CalculateStudentGrade 
{
	public static StudentGrade calculateGrade(Student s)
	{
		int marks = s.getMarks();
		
		if(marks > 90)
		{
			return new StudentGrade(s,'A');
		}	
		else if(marks>= 75)
		{
			return new StudentGrade(s,'B');
		}
		else if(marks >= 60)
		{
			return new StudentGrade(s,'C');
		}
		else {
			return new StudentGrade(s,'D');
		}
	}
}

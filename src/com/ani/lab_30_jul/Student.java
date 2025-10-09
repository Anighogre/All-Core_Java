package com.ani.lab_30_jul;

class Student
{
    private int studentId;
    private String studentName;
    private int studentMarks;
    private char studentGrade;

     public Student(int studentId, int studentMarks, String studentName)
     {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentMarks = studentMarks;
     }

     public void calculateGrade()
     {
        if(studentMarks > 90)
        {
         studentGrade = 'A';
        } else if(studentMarks >= 81 && studentMarks <= 90)
        {
         studentGrade = 'B';
        }else if(studentMarks >= 71 && studentMarks <= 80)
        {
         studentGrade = 'C';
        }else if(studentMarks >= 61 && studentMarks <= 70)
        {
         studentGrade = 'D';
        } else studentGrade = 'E';
     }

	@Override
	public String toString() {
		return "Name: "+ studentName + "\nStudent ID: " + studentId + "\nMarks: "+ studentMarks + "\nGrade: "+ studentGrade; 
	}

     
     
	
//     public String displayDetails()
//     {
//      return "Name: "+ studentName + "\nStudent ID: " + studentId + "\nMarks: "+ studentMarks + "\nGrade: "+ studentGrade; 
//     }
}
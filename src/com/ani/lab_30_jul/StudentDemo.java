package com.ani.lab_30_jul;

import java.util.Scanner;

public class StudentDemo {
    public static void main(String [] args)
    {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter student id :");
       int id = sc.nextInt();
       
       System.out.print("Enter student marks :");
       int marks = sc.nextInt();
       sc.nextLine();
       
       System.out.print("Enter student name :");
       String name = sc.nextLine();

       Student s1 = new Student(id,marks,name);
       s1.calculateGrade();
       System.out.println(s1);
    }
 }
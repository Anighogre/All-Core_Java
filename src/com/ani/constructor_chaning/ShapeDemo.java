package com.ani.constructor_chaning;

import java.util.Scanner;

class Shape
{
	protected int x;
	
	public Shape(int x)
	{
		this.x = x;
		System.out.println("X values is :"+x);
	}
}

class Square extends Shape
{
	public Square(int side)
	{
		super(side);
	}
	
	public void getAreaOfSquare()
	{
		double area = this.x*this.x;
		System.out.println("Area of square :"+area);
	}
}

class Rectangle extends Shape
{
	protected int breadth;
	
	public Rectangle(int length, int breadth)
	{
		super(length);
		this.breadth = breadth;
	}
	
	public void getAreaOfRectangle()
	{
		double area = this.x * this.breadth;
		System.out.println("Area of rectangle :"+area);
	}
}

public class ShapeDemo 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the side of square :");
		int side = Integer.parseInt(sc.nextLine());
		
		Square s1 = new Square(side);
		s1.getAreaOfSquare();
		
		System.out.println("Enter the length of the rectangle :");
		int length = Integer.parseInt(sc.nextLine());
		
		System.out.println("Enter the breadth of the rectangle :");
		int breadth = Integer.parseInt(sc.nextLine());
		
		Rectangle r1 = new Rectangle(length, breadth);
		r1.getAreaOfRectangle();

		sc.close();
	}

}

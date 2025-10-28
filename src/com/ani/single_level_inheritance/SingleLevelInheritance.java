package com.ani.single_level_inheritance;

// single level inheritance with encapsulation

class Super{
	private int x,y;
	
	public void setDate(int x, int y)
	{
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
}

class Sub extends Super{
	public void showData()
	{
		System.out.println("x value is :"+this.getX());
		System.out.println("y value is :"+this.getY());
	}
}

public class SingleLevelInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Sub s1 = new Sub();
		s1.setDate(100, 220);
		s1.showData();

	}

}

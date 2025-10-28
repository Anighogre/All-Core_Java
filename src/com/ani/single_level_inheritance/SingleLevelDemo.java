package com.ani.single_level_inheritance;

class Father {
	public void house()
	{
		System.out.println("3 BHK house");
	}
}

class Son extends Father{
	public void car()
	{
		System.out.println("Audi car");
	}
}


public class SingleLevelDemo {
	public static void main(String[] args)
	{
		Son son = new Son();
		son.house();
		son.car();
	}

}

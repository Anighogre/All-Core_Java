package com.ani.factory_design_pattern;

public class Test {
	
	private Test(int x)
	{
		
	}
	
	public Test accept() // factory method
	{
//		return null;
//		return this;
//		return new Test();
		Test t1 = new Test(5); // this statement depends on constructor
		return t1;
	}

}

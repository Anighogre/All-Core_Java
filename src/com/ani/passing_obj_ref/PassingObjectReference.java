package com.ani.passing_obj_ref;

public class PassingObjectReference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e1 = new Employee(111,"Scott");
		
		Manager m1 = new Manager(e1);
		System.out.println(m1);

	}

}

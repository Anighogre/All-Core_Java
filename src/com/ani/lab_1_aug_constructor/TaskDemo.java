package com.ani.lab_1_aug_constructor;

public class TaskDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Task t1 = new Task("Not Complete Project","Finish the Java project by Friday", "High");
		
		System.out.println("Title: "+t1.getTitle());
		System.out.println("Description: "+t1.getDescription());
		System.out.println("Priority: "+t1.getPriority());
		System.out.println("Is Completed: "+t1.isCompleted());
		
		t1.updateTitle("Complete Project");
		t1.updateDescription("Finish the updated Java project by Thursday");		
		t1.updatePriority("Medium");
		
		
		System.out.println();
		System.out.println("After updated");
		System.out.println();
		
		
		System.out.println("Title: "+t1.getTitle());
		System.out.println("Description: "+t1.getDescription());
		System.out.println("Priority: "+t1.getPriority());
		System.out.println("Is Completed: "+t1.isCompleted());
		
	}

}

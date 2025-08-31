package com.ani.lab_1_aug_constructor;

public class Task 
{
	private String title;
	private String description;
	private String priority;
	private String isCompleted;
	
	public Task(String title, String description, String priority) 
	{
		super();
		if(title == null || title.trim().isEmpty() || title.equals("null"))
		{
			System.err.println("Title can not be null or empty");
			System.exit(0);
		}
		
		this.title = title;
		this.description = description;
		this.priority = priority;
	}
	
	public void updateTitle(String newTitle)
	{
		this.title = newTitle;
	}
	
	public void updateDescription(String newDescription)
	{
		this.description = newDescription;
	}
	
	public void updatePriority(String newPriority)
	{
		this.priority = newPriority;
	}
	
	public boolean markAsCompleted()
	{
		if(isCompleted == "Complete Project")
		{
			return true;
		} else {
			isCompleted = "Complete Project";
			return false;
		}
	}
	
	public String getTitle()
	{
		return this.title;
	}
	
	public String getDescription()
	{
		return this.description;
	}
	
	public String getPriority()
	{
		return this.priority;
	}

	public boolean isCompleted()
	{
		return markAsCompleted();
	}
}

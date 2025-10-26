package com.ani.passing_obj_ref;

public class Manager {
	private int managerId;
	private String managerName;
	
	public Manager(Employee e)
	{
		this.managerId = e.getEmployeeId();
		this.managerName = e.getEmployeeName();
	}

	@Override
	public String toString() 
	{
		return "Manager [managerId=" + managerId + ", managerName=" + managerName + "]";
	}
	
	

}

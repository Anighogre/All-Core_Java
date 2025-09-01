package com.ani.lab_12_aug_inheritance;

public class Dog extends Mammal
{
	private String breedName;

	public Dog(String name, boolean hasFur, String breedName) 
	{
		super(name, hasFur);
		this.breedName = breedName;
	}

	public String getBreedName() 
	{
		return breedName;
	}

	public void setBreedName(String breedName)
	{
		this.breedName = breedName;
	}

	@Override
	public String toString() 
	{
		
		return "Dog [getName=" + getName() + " isHasFur="+ isHasFur() + " breed="+breedName + "]";
	}

	
	
	
	
}

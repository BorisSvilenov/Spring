package edu.school.enums;

public enum Role {
	STUDENT(1),
	TEACHER(2),
	PARENT(4),
	ADMINISTRATOR(8);
	
	public int value;
	
	private Role(int value) 
	{
		this.value=value;
	}
	
	public int getValue() 
	{
		return this.value;
	}
	
	public Role of(int value) 
	{
		for(Role r : Role.values()) 
		{
			if(r.value == value) 
			{
				return r;
			}
		}
		return Role.STUDENT;
		
	}

}

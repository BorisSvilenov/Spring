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
	

}

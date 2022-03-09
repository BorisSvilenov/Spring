package edu.school.models;

public class Subject {
	private Long id;
	private String name;
	public Subject(String name) 
	{
		this.id=0L;
		setName(name);
	}
	public Subject() 
	{
		this("Unknown");
	}
	
	@Override
	public String toString() 
	{
		return String.format("%s", getName());
	}
	@Override
	public boolean equals(Object o) 
	{
		if(o == null) 
		{
			return false;
			
		}
		if(!(o instanceof Subject)) 
		{
			return false;
		}
		Subject compareTo = (Subject) o;
		return compareTo.getId()==getId();
	}
	@Override
	public int hashCode() 
	{
		return getId().hashCode();
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if(name != null && !name.isEmpty())
		this.name = name;
	}
}

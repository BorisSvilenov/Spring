package edu.school.models;

import java.util.EnumSet;
import java.util.List;

import edu.school.enums.Role;

public class User {
	private Long id;
	private String firstName;
	private String lastName;
	private String email;
	private String phoneNumber;
	private String address;
	private String password;
	private EnumSet<Role> roles;
	
	public User(String firstName, String lastName, 
			String email, String phoneNumber, String address, String password) 
	{
		this.id=0L;
		setFirstName(firstName);
		setLastName(lastName);
		setEmail(email);
		setPhoneNumber(phoneNumber);
		setAddress(address);
		setPassword(password);

		
	}
	public User(String firstName, String lastName, 
			String email, String phoneNumber, String address, String password, EnumSet<Role> set) 
	{
		this.id=0L;
		setFirstName(firstName);
		setLastName(lastName);
		setEmail(email);
		setPhoneNumber(phoneNumber);
		setAddress(address);
		setPassword(password);
		setRoles(set);
		
		
	}
	public User() 
	{
		this.id=0L;
		setFirstName("Unknown");
		setLastName("Unknown");
		setEmail("Unknown");
		setPhoneNumber("Unknown");
		setAddress("Unknown");
		setPassword("N/A");
	
	}
	
	public EnumSet<Role> getRoles() {
		return roles;
	}
	public void setRoles(EnumSet<Role> roles) {
		this.roles = roles;
	}
	public void addRole(Role r) 
	{
		roles.add(r);
		
	}
	
	
	@Override
	public String toString() 
	{
		//return String.format("%s,%s,%s,%s,%s,%s,%s",getFirstName(),getLastName(),getEmail(),getPhoneNumber(),
		//		getAddress(),getPassword(),getRole().toString());
		
	}
	
	@Override
	public boolean equals(Object o) 
	{
		if(o == null) 
		{
			return false;
		}
		if(!(o instanceof User)) 
		{
			return false;
		}
		User compareTo=(User) o;
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
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		if(firstName != null && !firstName.isEmpty())
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		if(lastName != null && !lastName.isEmpty())
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		if(email != null && !email.isEmpty())
		this.email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		if(phoneNumber != null && !phoneNumber.isEmpty())
		this.phoneNumber = phoneNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		if(address != null && !address.isEmpty())
		this.address = address;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		if(password != null && !password.isEmpty())
		this.password = password;
	}

	
	

}

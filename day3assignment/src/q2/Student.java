package q2;

import java.io.Serializable;

public class Student implements Serializable{

	private int roll;
	private String Name;
    private Address	address; // Employee Has Address
	private String	email;
	transient private String password;
	
	
	public Student() {
		
	}
	
	public Student(int roll, String name, Address address, String email, String password) {
		super();
		this.roll = roll;
		Name = name;
		this.address = address;
		this.email = email;
		this.password = password;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", Name=" + Name + ", address=" + address + ", email=" + email + "]";
	}
	
	

}

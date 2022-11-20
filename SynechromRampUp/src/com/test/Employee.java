package com.test;

public class Employee {

	private int empId;
	private String firstName;
	private String lastName;
	private int age;
	
	public Employee(int empId, String firstName, String lastName, int age) {
		super();
		this.empId = empId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}

	public int getEmpId() {
		return empId;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public int getAge() {
		return age;
	}
	
	
	
	
}

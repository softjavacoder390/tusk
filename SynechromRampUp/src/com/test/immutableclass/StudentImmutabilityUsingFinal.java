package com.test.immutableclass;

import java.util.ArrayList;
import java.util.List;

class StudentTemp {

	private final int id;
	private final String name;
	private final List<String> hobbies;

	public StudentTemp(int id, String name, List<String> hobbiesList) {
		super();
		this.id = id;
		this.name = name;
		this.hobbies = hobbiesList;
		
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public List<String> getHobbies() {
		
		return hobbies;
	}

	// public void setHibbies(List<String> hibbies) {
	// this.hibbies = hibbies;
	// }
	//
	// public void setName(String name) {
	// this.name = name;
	// }
	//
	// public void setId(int id) {
	// this.id = id;
	// }

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", hobbies=" + hobbies + "]";
	}

}

public class StudentImmutabilityUsingFinal {

	public static void main(String[] args) {

		List<String> hobbies = new ArrayList<String>();

		hobbies.add("swimming");
		hobbies.add("cricket");

		StudentTemp student = new StudentTemp(101, "bharat", hobbies);
		
		hobbies.set(2,"masti");
		// student.setName("shanu");

		System.out.println(student);
		hobbies = student.getHobbies();
		hobbies.set(1,"grand masti");
		System.out.println(student);

	}

}

package com.test.immutableclass;

import java.util.ArrayList;
import java.util.List;

class Student {

	private int id;
	private String name;
	private List<String> hobbies;

	public Student(int id, String name, List<String> hobbiesList) {
		super();
		this.id = id;
		this.name = name;
		// this.hobbies = hobbiesList;
		hobbies = new ArrayList<>();
		for (String hobby : hobbiesList) {
			hobbies.add(hobby);

		}
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public List<String> getHobbies() {
		List<String> newList = new ArrayList<>();
		for (String hobby : hobbies) {
			newList.add(hobby);
		}
		return newList;
		// return hobbies;
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

public class StudentImmutability {

	public static void main(String[] args) {

		List<String> hobbies = new ArrayList<String>();

		hobbies.add("swimming");
		hobbies.add("cricket");

		Student student = new Student(101, "bharat", hobbies);
		hobbies.add("masti");
		// student.setName("shanu");

		System.out.println(student);
		hobbies = student.getHobbies();
		hobbies.add("grand masti");
		System.out.println(student);

	}

}

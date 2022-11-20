package com.test;

import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class FindUniqueEmployee {

	
	public static void main(String[] args) {
		Employee e1=new Employee(1, "Sumeet", "Waglekar", 32);
		Employee e2=new Employee(2, "Sumeet", "Waglekar", 32);
		Employee e3=new Employee(3, "Jitendra", "A", 32);

		TreeSet<Employee> list = new TreeSet<Employee>((emp1,emp2)-> emp1.getFirstName().compareTo(emp2.getFirstName())) ;
		
		System.out.println(list);
		
		Set<Employee> collect = list.stream().collect(Collectors.toSet());
	}
}

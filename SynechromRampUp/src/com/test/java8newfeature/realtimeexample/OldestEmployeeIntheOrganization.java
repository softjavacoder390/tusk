package com.test.java8newfeature.realtimeexample;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

//Who is the oldest employee in the organization? What is his age and which department he belongs to?
public class OldestEmployeeIntheOrganization {

	public static void main(String[] args) {
		List<Employee> employeeList = Employee.getEmployeeList();
		
		Optional<Employee> oldestEmployeeWrapper  = employeeList.stream().max(Comparator.comparingInt(Employee::getAge));
		
		Employee employee = oldestEmployeeWrapper.get();
		
		System.out.println("name : "+employee.getName());
		System.out.println("age : "+employee.getAge());
		System.out.println("Department : "+employee.getDepartment());
		
		
		
	}
}

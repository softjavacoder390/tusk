package com.test.java8newfeature.java2blog;

import java.util.List;
import java.util.stream.Collectors;

import com.test.java8newfeature.realtimeexample.Employee;

//Given a list of employees, you need to filter all the employee whose age 
//is greater than 20 and print the employee names.(Java 8 APIs only)

public class EmployeAgeGT20 {

	public static void main(String[] args) {
		
		List<Employee> employeeList = Employee.getEmployeeList();
		//List<Employee> employeeList1 = employeeList.stream().filter(e->e.getAge() >20).collect(Collectors.toList());
		employeeList.stream().filter(e->e.getAge() >40).collect(Collectors.toList())
		.forEach(e->System.out.println(e.getName()));
		
		employeeList.stream().filter(e->e.getAge() >30)
		.map(e ->e.getName()).collect(Collectors.toList()).forEach(System.out::println);
		
		
		
		
	}
}

package com.test.java8newfeature.realtimeexample;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Averageageofmaleandfemaleemployees {

public static void main(String[] args) {
		
		List<Employee> employeeList = Employee.getEmployeeList();
		
		Map<String, Double> noOfMaleAndFemaleEmployees=
				employeeList.stream().
				collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)));
				System.out.println(noOfMaleAndFemaleEmployees);
				
	}
}

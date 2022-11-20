package com.test.java8newfeature.realtimeexample;

import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class HowmanymaleandfemaleemployeesEx {
	
	public static void main(String[] args) {
		
		List<Employee> employeeList = Employee.getEmployeeList();
		
		Map<String, Long> noOfMaleAndFemaleEmployees=
				employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
				System.out.println(noOfMaleAndFemaleEmployees);
				
				noOfMaleAndFemaleEmployees.forEach((k,v)->System.out.print(":"+k+" : "+v));
				
				
	}

}

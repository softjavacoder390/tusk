package com.test.java8newfeature.realtimeexample;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeesWhoHaveJoinedAfter2015 {
	public static void main(String[] args) {

		List<Employee> employeeList = Employee.getEmployeeList();

		employeeList.stream().filter(e -> e.getYearOfJoining() > 2015).map(Employee::getName)
				.forEach(System.out::println);

		
		
	}
}

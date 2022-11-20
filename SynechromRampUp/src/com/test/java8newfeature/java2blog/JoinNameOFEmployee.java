package com.test.java8newfeature.java2blog;

import java.util.List;
import java.util.stream.Collectors;

import com.test.java8newfeature.realtimeexample.Employee;

//Join the all employee names with “,” using java 8?
public class JoinNameOFEmployee {

	public static void main(String[] args) {

		List<Employee> employeeList = Employee.getEmployeeList();
		// case 1
		List<String> employeeNames = employeeList.stream().map(Employee::getName).collect(Collectors.toList());
		String employeeNamesStr = String.join(",", employeeNames);
		System.out.println("Employees are: " + employeeNamesStr);

	}
}

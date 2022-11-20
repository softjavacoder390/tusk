package com.test.java8newfeature.realtimeexample;

import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class PrintnameofalldepartmentsEx {

	public static void main(String[] args) {

		List<Employee> employeeList = Employee.getEmployeeList();
		employeeList.stream().map(e->e.getDepartment()).distinct().forEach(System.out::println);

		employeeList.stream().map(Employee::getDepartment).distinct().forEach(System.out::println);

	}

}

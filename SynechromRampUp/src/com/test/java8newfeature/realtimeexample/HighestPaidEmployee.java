package com.test.java8newfeature.realtimeexample;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class HighestPaidEmployee {

	public static void main(String[] args) {

		List<Employee> employeeList = Employee.getEmployeeList();

		Optional<Employee> noOfMaleAndFemaleEmployees = employeeList.stream()
				.min((e1, e2) -> (e1.getSalary() < e2.getSalary()) ? 1 : (e1.getSalary() > e2.getSalary()) ? -1 : 0);
		System.out.println(noOfMaleAndFemaleEmployees);
		
		Optional<Employee> highestPaidEmployeeWrapper = employeeList.stream()
				.collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)));

		Employee highestPaidEmployee = highestPaidEmployeeWrapper.get();
		System.out.println("Details Of Highest Paid Employee : ");
        
		System.out.println("==================================");
		         
		System.out.println("ID : "+highestPaidEmployee.getId());
		         
		System.out.println("Name : "+highestPaidEmployee.getName());
		         
		System.out.println("Age : "+highestPaidEmployee.getAge());
		         
		System.out.println("Gender : "+highestPaidEmployee.getGender());
		         
		System.out.println("Department : "+highestPaidEmployee.getDepartment());
		         
		System.out.println("Year Of Joining : "+highestPaidEmployee.getYearOfJoining());
		         
		System.out.println("Salary : "+highestPaidEmployee.getSalary());

	}
}

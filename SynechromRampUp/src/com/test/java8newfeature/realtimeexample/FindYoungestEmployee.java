package com.test.java8newfeature.realtimeexample;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class FindYoungestEmployee {

	public static void main(String[] args) {
		List<Employee> employeeList = Employee.getEmployeeList();
		Optional<Employee> youngestMaleEmployeeInProductDevelopmentWrapper=
				employeeList.stream()
				            .filter(e -> e.getGender()=="Male" && e.getDepartment()=="Product Development")
				            .min(Comparator.comparingInt(Employee::getAge));
				         
				Employee youngestMaleEmployeeInProductDevelopment = youngestMaleEmployeeInProductDevelopmentWrapper.get();
				         
				System.out.println("Details Of Youngest Male Employee In Product Development");
				         
				System.out.println("----------------------------------------------");
				         
				System.out.println("ID : "+youngestMaleEmployeeInProductDevelopment.getId());
				         
				System.out.println("Name : "+youngestMaleEmployeeInProductDevelopment.getName());
				         
				System.out.println("Age : "+youngestMaleEmployeeInProductDevelopment.getAge());
				         
				System.out.println("Year Of Joinging : "+youngestMaleEmployeeInProductDevelopment.getYearOfJoining());
				         
				System.out.println("Salary : "+youngestMaleEmployeeInProductDevelopment.getSalary());

	
	}
}

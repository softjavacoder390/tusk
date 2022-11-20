package com.test.java8newfeature.java2blog;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.Collectors;

import com.test.java8newfeature.realtimeexample.Employee;

//Given a list of employee, find maximum age of employee?
public class MaximumAgeEmployee {

	public static void main(String[] args) {
		
		List<Employee> employeeList = Employee.getEmployeeList();
		
		//case ;1
		Optional<Employee> employeeList333 = employeeList.stream()
				.sorted((e1, e2) -> (e1.getSalary() < e2.getSalary()) ? 1 : (e1.getSalary() > e2.getSalary()) ? -1 : 0).findFirst();
		System.out.println("bhart   "+employeeList333.get());

		//case 2
		OptionalInt max = employeeList.stream().mapToInt(Employee::getAge).max();
		 if(max.isPresent())
	            System.out.println("Maximum age of Employee: "+max.getAsInt());
		 
		 //case 3
		 OptionalDouble maxSal = employeeList.stream().mapToDouble(Employee::getSalary).max();
		 if(max.isPresent())
	            System.out.println("Maximum age of Employee: "+maxSal.getAsDouble());
		 
		 //case 4
		 Optional<Employee> highestPaidEmployeeWrapper = employeeList.stream()
					.collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)));
		 Employee highestPaidEmployee = highestPaidEmployeeWrapper.get();
		 System.out.println("Salary : "+highestPaidEmployee.getSalary());
		 
		 //case 5
		 
		 Optional<Employee> noOfMaleAndFemaleEmployees = employeeList.stream()
					.min((e1, e2) -> (e1.getSalary() < e2.getSalary()) ? 1 : (e1.getSalary() > e2.getSalary()) ? -1 : 0);
			System.out.println(noOfMaleAndFemaleEmployees);
			
		 
		
	}
}

package com.test.java8newfeature.realtimeexample;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class MostWorkingExprience {

	public static void main(String[] args) {
		List<Employee> employeeList = Employee.getEmployeeList();
		
		Optional<Employee> seniorMostEmployeeWrapper=
				employeeList.stream().sorted(Comparator.comparingInt(Employee::getYearOfJoining)).findFirst();
				         
				Employee seniorMostEmployee = seniorMostEmployeeWrapper.get();
				         
				System.out.println("Senior Most Employee Details :");
				         
				System.out.println("----------------------------");
				         
				System.out.println("ID : "+seniorMostEmployee.getId());
				         
				System.out.println("Name : "+seniorMostEmployee.getName());
				         
				System.out.println("Age : "+seniorMostEmployee.getAge());
				         
				System.out.println("Gender : "+seniorMostEmployee.getGender());
				         
				System.out.println("Age : "+seniorMostEmployee.getDepartment());
				         
				System.out.println("Year Of Joinging : "+seniorMostEmployee.getYearOfJoining());
				         
				System.out.println("Salary : "+seniorMostEmployee.getSalary());
	}
}

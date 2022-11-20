package com.test.java8newfeature.java2blog;

import java.util.List;
import java.util.stream.Collectors;

import com.test.java8newfeature.realtimeexample.Employee;

//Given the list of employees, count number of employees with age 25?
public class CountEmployeAge30 {

	public static void main(String[] args) {
		
		List<Employee> employeeList = Employee.getEmployeeList();
		//List<Employee> employeeList1 = employeeList.stream().filter(e->e.getAge() >20).collect(Collectors.toList());
		long o = employeeList.stream().filter(e->e.getAge() >30).collect(Collectors.counting());
		
		System.out.println(o);	
		
		System.out.println(employeeList.stream().filter(e->e.getAge() >30).count());
		
	}
}

package com.test.java8newfeature.java2blog;

import java.util.List;
import java.util.stream.Collectors;

import com.test.java8newfeature.realtimeexample.Employee;

public class SortAlltheEmployee {

	public static void main(String[] args) {
		List<Employee> employeeList = Employee.getEmployeeList();
	        //case 1
		    employeeList.sort((e1,e2)->e1.getAge()-e2.getAge());
	        employeeList.forEach(System.out::println);
	        
	        System.out.println();
	        
	        //case 2
	        employeeList.stream().sorted((e1,e2)->e1.getAge()-e2.getAge())
	        .collect(Collectors.toList()).forEach(System.out::println);
	        //employeeList.stream().sorted((e1,e2)->e1.getAge()-e2.getAge())
	        //.forEach(e->System.out.println(e.getName()));
	        
	        
	        
	}
}

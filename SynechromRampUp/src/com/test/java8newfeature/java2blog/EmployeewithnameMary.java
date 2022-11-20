package com.test.java8newfeature.java2blog;

import java.util.List;
import java.util.Optional;

import com.test.java8newfeature.realtimeexample.Employee;

//Given the list of employees, find the employee with name “Mary”.
public class EmployeewithnameMary {

	public static void main(String[] args) {
		
		List<Employee> employeeList = Employee.getEmployeeList();
//		
//		
//		employeeList.stream().filter(e->"Anuj Chettiar".equals(e.getName()))
//		.map(e ->e.getName()).collect(Collectors.toList()).forEach(System.out::println);
		
        Optional<Employee> e1 = employeeList.stream()
                  .filter(e->e.getName().equalsIgnoreCase("Anuj Chettiar")).findAny();
 
        if(e1.isPresent())
            System.out.println(e1.get());
	}
	
}

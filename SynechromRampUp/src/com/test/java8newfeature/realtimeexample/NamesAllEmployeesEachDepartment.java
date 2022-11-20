package com.test.java8newfeature.realtimeexample;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class NamesAllEmployeesEachDepartment {

	public static void main(String[] args) {
		List<Employee> employeeList = Employee.getEmployeeList();
		
		Map<String, List<Employee>> employeeListByDepartment=
				employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment));
				         
				Set<Entry<String, List<Employee>>> entrySet = employeeListByDepartment.entrySet();
				         
				for (Entry<String, List<Employee>> entry : entrySet) 
				{
				    System.out.println("--------------------------------------");
				             
				    System.out.println("Employees In "+entry.getKey() + " : ");
				             
				    System.out.println("--------------------------------------");
				             
				    List<Employee> list = entry.getValue();
				             
				    for (Employee e : list) 
				    {
				        System.out.println(e.getName());
				    }
				}
	}
	
}

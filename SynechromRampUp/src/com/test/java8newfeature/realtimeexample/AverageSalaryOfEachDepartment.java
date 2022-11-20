package com.test.java8newfeature.realtimeexample;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class AverageSalaryOfEachDepartment {
	public static void main(String[] args) {
		List<Employee> employeeList = Employee.getEmployeeList();
		Map<String, Double> avgSalaryOfDepartments=
				employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));
				         
				Set<Entry<String, Double>> entrySet = avgSalaryOfDepartments.entrySet();
				         
				for (Entry<String, Double> entry : entrySet) 
				{
				    System.out.println(entry.getKey()+" : "+entry.getValue());
				}
	}

}

package com.test.java8newfeature.realtimeexample;

import java.util.DoubleSummaryStatistics;
import java.util.List;
//What is the average salary and total salary of the whole organization?
import java.util.stream.Collectors;

public class AverageSalaryAndTotalSalary {

	public static void main(String[] args) {

		List<Employee> employeeList = Employee.getEmployeeList();
		DoubleSummaryStatistics employeeSalaryStatistics=
				employeeList.stream().collect(Collectors.summarizingDouble(Employee::getSalary));
				         
				System.out.println("Average Salary = "+employeeSalaryStatistics.getAverage());
				         
				System.out.println("Total Salary = "+employeeSalaryStatistics.getSum());
				
	}
	
}

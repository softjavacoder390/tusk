package com.test.java8newfeature.lambdaexpression;

import java.util.ArrayList;
import java.util.Collections;

class Employee{
	String name;
	int eno;
	long salary;
	public Employee(String name, int eno, long salary) {
		super();
		this.name = name;
		this.eno = eno;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", eno=" + eno + ",salary=" + salary + "]";
	}
	
	
	
}
public class SortEmployeeWithLamdaCase1 {
	
	public static void main(String[] args) {
	ArrayList<Employee> empList = new ArrayList<>();
	empList.add(new Employee("bhart",1234,40000));
	empList.add(new Employee("harish",123,99000));
	empList.add(new Employee("manish",12,85000));
	empList.add(new Employee("chandu",1,90000));
	empList.add(new Employee("sharad",12345,60000));
	
	System.out.println(empList);
	Collections.sort(empList, (e1,e2)->(e1.eno<e2.eno)?-1:(e1.eno>e2.eno)?1:0);
	System.out.println(empList);
	Collections.sort(empList, (e1,e2)->(e1.eno<e2.eno)?1:(e1.eno>e2.eno)?-1:0);//reverse order
	System.out.println(empList);
	Collections.sort(empList, (e1,e2)->e1.name.compareTo(e2.name));
	System.out.println(empList);
	Collections.sort(empList, (e1,e2)->-e1.name.compareTo(e2.name)); // reverse order
	System.out.println(empList);
	Collections.sort(empList, (e1,e2)->(e1.salary<e2.salary)?-1:(e1.salary>e2.salary)?1:0);
	System.out.println(empList);
	System.out.println(empList.get(0)); // second highest salary
	
	}

}

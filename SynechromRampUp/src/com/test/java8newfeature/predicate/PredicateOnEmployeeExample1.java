package com.test.java8newfeature.predicate;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Predicate;

class Employee {
	String name;
	int eno;
	double salary;

	public Employee(String name, int eno, double salary) {
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

public class PredicateOnEmployeeExample1 {

	public static void main(String[] args) {
		ArrayList<Employee> empList = new ArrayList<>();
		empList.add(new Employee("bhart", 1234, 40000.0));
		empList.add(new Employee("harish", 123, 99000.));
		empList.add(new Employee("manish", 12, 85000));
		empList.add(new Employee("chandu", 1, 90000));
		empList.add(new Employee("sharad", 12345, 60000));

		Predicate<Employee> p = e -> e.salary > 50000;

		for (Employee e : empList) {
			if (p.test(e)) {
				System.out.println(e);
			}
		}

	}

}

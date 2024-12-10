package com.rsg.practice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeClient {

	public static void main(String[] args) {
		
		 List<Employee> employees = Arrays.asList(
		            new Employee("Alice", "Female", 60000),
		            new Employee("Bob", "Male", 45000),
		            new Employee("Charlie", "Male", 70000),
		            new Employee("Diana", "Female", 80000),
		            new Employee("Eve", "Female", 50000)
		        );
		 
		 Map<String, Long> result = employees.stream().filter(emp->emp.getSalary()>50000)
				 .collect(Collectors.groupingBy(Employee::getGender, Collectors.counting())); 

System.out.println(result);
	}

}

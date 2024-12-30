package com.igt.variables;

public class EmployeeClient {

	public static void main(String[] args) {
		
		Employee employee1 = new Employee(101, "Hritik");
		
		
		System.out.println(employee1.getId());
		
		System.out.println(employee1.getName());
		
		System.out.println(Employee.companyName);
		
		int a = 10;
		
		System.out.println(a);
		
		

	}

}

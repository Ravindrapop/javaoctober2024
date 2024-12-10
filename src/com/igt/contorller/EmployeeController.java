package com.igt.contorller;

import com.rsg.oops.Employee;

public class EmployeeController {
	
	
	public String createEmployee(Employee emp) {
		
		System.out.println(emp.getId());
		System.out.println(emp.getName());
		
		
		return "Employee has been created!!!";
		
		
	}
	
	
	

}

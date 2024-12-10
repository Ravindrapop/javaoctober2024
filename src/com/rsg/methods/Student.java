package com.rsg.methods;

import java.util.ArrayList;
import java.util.List;

public class Student {
	Integer id;
	String name ;
	List<Integer> deptIds;  // like Maths, Science etc.
	
	// All the departments with at least two students
	
	public static void main(String[] args) {
		List<Student> studentList = new ArrayList<Student>();
		List<Department> departmentList = new ArrayList<Department>();
		
		
		
	}
}
class Department {
Integer departmentId;
	String deptName;
}

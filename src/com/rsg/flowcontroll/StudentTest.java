package com.rsg.flowcontroll;

public class StudentTest {

	public static void main(String[] args) {
		
		Student student = new Student(101, "Bharat");
		
		System.out.println(student.getId());
		
		System.out.println(student.getName());
		
		student.setId(102);
		
		

	}

}

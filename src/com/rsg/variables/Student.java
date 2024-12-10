package com.rsg.variables;

public class Student {

	int id;

	String name;

	String address;

	public Student() {
		
	}
	
	public Student(int id, String name) {
		
		this.id=id;
		this.name=name;
		
	}

	public static void main(String[] args) {
		Student s1 = new Student(101, "ravi");
		
		

	}

}

package com.rsg.oops.overriding;

public class Student {
	
	private int id;
	private String name;
	
	{
		System.out.println("Instance block...");
		
	}
		
	public Student(int id, String name) {
		this.id=id;
		this.name=name;
	}

	public static void main(String[] args) {
		
		Student student = new Student(101, "Hari"); 
		
		System.out.println(student.id);
		System.out.println(student.name);

	}

}

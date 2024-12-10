package com.rsg.model;

public class StudentClient {

	public static void main(String[] args) {
		
		Student s1 = new Student();
		
		s1.setId(101);
		s1.setName("Hari");
		
		
		System.out.println(s1.getId());
		System.out.println(s1.getName());
		
		Student s2 = new Student();
		
		s2.setId(102);
		s2.setName("Abhishek");
		
		System.out.println(s2.getId()+"  "+s2.getName());

	}

}

package com.rsg.operators;

public class StudentClient {

	public static void main(String[] args) {
		
		Student s1 = new Student(101,"Jyoti");
		
		Student s2 = new Student(101,"Jyoti");
		
		System.out.println(s1==s2);
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		
		System.out.println();
		
		
		Object obj = new Object();
		
		System.out.println(s1.equals(s2));

	}

}

package com.rsg.interfaces;

public class StudentClient {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Student student1 = new Student(101,"Hari");
		
		Student student3 = student1;  // Shallow copy
		
		Student student2 = (Student)student1.clone(); // deep copy
		
		System.out.println(student1.hashCode()+" "+student3.hashCode());
		System.out.println(student1.hashCode()+" "+student2.hashCode());

	}

}

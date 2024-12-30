package com.rsg.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo2 {

	public static void main(String[] args) {

		List<Student> studentList = new ArrayList<Student>();

		studentList.add(new Student(101, "Priyanka"));

		studentList.add(new Student(102, "Jyoti"));

		studentList.add(new Student(104, "Gourav"));

		studentList.add(new Student(103, "Anjali"));

		studentList.add(new Student(105, "Deepa"));
		
		studentList.add(new Student(101, "Priyanka"));
		
		studentList.add(null);

		Iterator<Student> itr = studentList.iterator();

		while (itr.hasNext()) {
			Student s1 = itr.next();
			System.out.println(s1);
		}

		System.out.println("Fetching the student List elements using for each loop : ");

		for (Student s1 : studentList) {
			System.out.println(s1);
		}

		System.out.println("Fetching the student List elements using advance each loop : ");
		studentList.forEach((s1) -> {
			System.out.println(s1);
		});
		
		
		studentList.add(2, new Student(106,"Abhi"));
		
		

	}

}

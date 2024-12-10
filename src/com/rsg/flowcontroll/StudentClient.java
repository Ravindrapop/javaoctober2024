package com.rsg.flowcontroll;

public class StudentClient {

	public static void main(String[] args) {
		
		
		Student[] sArray = new Student[5];
		
		
		
	//	Student[] sArray = new Student[10];
		
		sArray[0] = new Student(101,"Jyoti");
		sArray[1] = new Student(103,"Hari");
		sArray[2] = new Student(104,"Komal");
		sArray[3] = new Student(104,"Komal");
		sArray[4] = new Student(105,"Ram");
		
		
		
		
		for(int i=0;i<sArray.length;i++) {
			
			System.out.println(sArray[i]);
			
		}
		
		

	}

}

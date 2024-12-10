package com.rsg.methods;

public class Test {
	
	
	public static void main(String[] args) {
		
		
		Test test = new Test();
		
		test.add(10,20);
		
		test.add(100, 200);
		
		test.add(5, 20);
		
		String str = test.wish("Hi good morning all!!!");
		
		System.out.println(str);
	}
	
	
	public void add(int a, int b) {
		
		
		int sum = a+b;
		
		System.out.println("The sum of a and b is : "+sum);
		
		
	}
	
	public String wish(String message) {
		
		System.out.println(message);
		
		return "Hello";
		
	}

}

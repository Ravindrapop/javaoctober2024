package com.rsg.operators;

public class Employee {
	

	
	
	
	public static void main(String[] args) {
		
		Thread t1 = new Thread();
		
		System.out.println(t1 instanceof Thread);
		
		System.out.println(t1 instanceof Runnable);
		
		System.out.println(t1 instanceof Object);
		
		
		Object o = new Object();
		
		System.out.println(o instanceof String);
		
		
		
	}

}

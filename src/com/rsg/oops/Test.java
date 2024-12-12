package com.rsg.oops;

public class Test {
	
	public void m1(Object o) {
		System.out.println("Object version");
	}
	
	
	public void m1(String s) {
		System.out.println("String version");
	}
	
	

	public static void main(String[] args) {
		
		Test test = new Test();
		
		test.m1(new Object());  // Object version
		
		test.m1("Durga");  // String version
		
		test.m1(null); // String version
		
		
		
		String s1 = "Deepa";
		
		String s2 = new String("Deepa");
		
		StringBuffer sb = new StringBuffer("Deepa");


	}

}

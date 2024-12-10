package com.rsg.methods;

public class Demo {
	
	
	
	public void m1(int... a) {
		
		System.out.println("Var arg method");
		
		
	}
	
	
	

	public static void main(String[] args) {
		
		Demo demo = new Demo();
		
		
		demo.m1();
		
		demo.m1(10);
		
		demo.m1(10,20);
		
		demo.m1(10,20,30);
		
		
	
	}
	
	
	

}

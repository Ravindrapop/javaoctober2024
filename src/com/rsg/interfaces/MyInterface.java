package com.rsg.interfaces;

public interface MyInterface {
	
	static void m1() {
		
		System.out.println("static");
		
	}
	
	default void m2() {
		
		System.out.println("default");
		
	}
	
	public void m3();

}

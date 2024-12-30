package com.rsg.desingpattern;

public class Demo {
	
	public Demo() {
		this(10);
		
		
	}
	
	public Demo(int i) {
		
	}

	public static void main(String[] args) {
		
		Demo demo = new Demo();
		
		Demo demo2 = new Demo(100);
		
		demo.m1();

	}

	private void m1() {
		
		System.out.println("Hi....");
		m1();
		
		
		
	}

}

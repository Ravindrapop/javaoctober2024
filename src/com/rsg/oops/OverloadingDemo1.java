package com.rsg.oops;

public class OverloadingDemo1 {
	
	public void m1() {
		System.out.println("zero Argument method");
	}
	
	public void m1(int i) {
		System.out.println("m1 method with one argument "+ i);
	}
	

	public static void main(String[] args) {
		
		
		OverloadingDemo1 overloadingDemo1 = new OverloadingDemo1();
		
		overloadingDemo1.m1();
		
		overloadingDemo1.m1(100);

	}

}

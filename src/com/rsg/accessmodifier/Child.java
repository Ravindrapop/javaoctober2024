package com.rsg.accessmodifier;

public class Child extends Parent{
	
	@Override
	public void m1() {
		System.out.println("m1 from child class");
	}

	public static void main(String[] args) {
		
		String s1 = new String();
		
	 int a = 10;
		
		a = 20;
		
		System.out.println(a);

	}

}

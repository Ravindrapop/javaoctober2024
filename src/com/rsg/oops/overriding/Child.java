package com.rsg.oops.overriding;

public class Child extends Parent{
	
	
	public String m1(int i) {
		
		System.out.println("m1 from child with "+i);
		
		return null;
		
	}
	
	
	
	public static void main(String[] args) {
		
		Parent p1 = new Parent();
		
		p1.m1(100);
		
		Child c1 = new Child();
		
		c1.m1(10);
		
		
		Parent p2 = new Child();
		
		p2.m1(20);
	}

}

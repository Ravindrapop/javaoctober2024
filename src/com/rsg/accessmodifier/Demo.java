package com.rsg.accessmodifier;

public class Demo {

	public static void main(String[] args) {
		//case 1
		P p1 = new P();
		
		p1.m1();
		
		//case 2
		C c1 = new C();

		c1.m1();
		
		//case 3
		P p2 = new C();
		
		p2.m1();
		
		Object obj = new Object();
		
		

	}
	
	
}

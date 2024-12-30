package com.rsg.oops.overriding;

public class C extends P{
	
static int x = 999;

	public static void m1() {
		
		System.out.println("m1 from child.");
	}

	public static void main(String[] args) {
		
		P p1 = new P();
		
		System.out.println(p1.x);
		
		C c1 = new C();
		
		System.out.println(c1.x);
		
		P p2 = new C();
		
		System.out.println(p2.x);

	}

}

package com.rsg.pkg2;

import com.rsg.pkg1.A;

public class B extends A{

	public static void main(String[] args) {
		
		
		A a1 = new A();
		
		//a1.m1();      now allowed due to protected members in parent class
		
		B b1 = new B();
		
		b1.m1();
		
		A a2 = new B();
		
		// a2.m1();  now allowed due to protected members in parent class
		
		
		
		

	}

}

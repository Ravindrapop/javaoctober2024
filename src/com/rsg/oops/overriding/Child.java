package com.rsg.oops.overriding;

import java.io.IOException;

public class Child extends Parent{
	
	@Override
	public String m1(int i)throws IOException {
		
		System.out.println("m1 from child with "+i);
		
		return null;
		
	}
	
	
	
	public static void main(String[] args) {
		
		
	}

}

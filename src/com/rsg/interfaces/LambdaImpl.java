package com.rsg.interfaces;

public class LambdaImpl {

	public static void main(String[] args) {

		Interf interf = (i) -> {
			System.out.println("Hi...");
		};
		
		interf.m1(100);
	}

}

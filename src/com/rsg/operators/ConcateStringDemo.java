package com.rsg.operators;

public class ConcateStringDemo {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		int c = 30;
		String d = "Hari";
		
		System.out.println(a+b+c+d);  //60Hari
		
		System.out.println(a+d+c+b); //10Hari2030
		
		System.out.println(d+a+b+c); // Hari102030
		
		System.out.println(a+b+d+c); // 30Hari30
		
		System.out.println(a+d+c); //10Hari30
		
		System.out.println(a+d+b+c); //10Hari2030 
	}

}

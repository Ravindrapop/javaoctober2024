package com.rsg.methods;

public class VarArgDemo1 {
	
	
	public static void sum(int... a) { 
		
		int total = 0;
		
		for(int x : a) {
			
			
			total = total+x;
			
		}
		
		System.out.println("The Sum : "+ total);
		
	}

	public static void main(String[] args) {
		
		
		sum();
		sum(10,20);
		sum(10,20,30);
		sum(10,20,30,40);

	}

}

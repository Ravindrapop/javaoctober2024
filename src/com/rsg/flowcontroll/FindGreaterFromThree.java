package com.rsg.flowcontroll;

public class FindGreaterFromThree {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 50;
		int c = 60;
		
		if(a>b) {
			
			if(a>c) {
				System.out.println("A is the greatest number");
			}else {
				System.out.println("C is the greatest number");
			}
			
		}else if(b>c) {
			System.out.println("B is the greatest number");
		}else {
			System.out.println("C is the greatest number");
		}

	}

}
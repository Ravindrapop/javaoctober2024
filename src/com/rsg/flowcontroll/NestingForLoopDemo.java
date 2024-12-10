package com.rsg.flowcontroll;

public class NestingForLoopDemo {

	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) {   // i=6
			
			for (int j = 1; j <= 5; j++) {
				
				System.out.print(j);
			}
			System.out.println();
		}

	}

}

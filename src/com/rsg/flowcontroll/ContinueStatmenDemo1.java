package com.rsg.flowcontroll;

public class ContinueStatmenDemo1 {

	public static void main(String[] args) {
		
		for(int i=0; i<=10; i++) {
			
			if(i%2==0)
				continue;
			System.out.println(i);
		}

	}

}

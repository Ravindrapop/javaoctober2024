package com.rsg.operators;

public class ShortCircOpeDemo {

	public static void main(String[] args) {
		
		int x = 8;
		
		int y = 15;
		
		if(++x>10 || ++y<15) {
			
			++x;
		}else {
			++y;
		}
		
		System.out.println(x+"      "+y);

	}

}

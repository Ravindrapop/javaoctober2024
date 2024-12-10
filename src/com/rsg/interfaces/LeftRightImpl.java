package com.rsg.interfaces;

public class LeftRightImpl implements Right, Left {
	
	@Override
	public void m1() {
		System.out.println("Hi...");
	}
	
	@Override
	public void m1(int i) {
		System.out.println(i);
	}
	
	
	public static void main(String[] args) {
		
		Right right = new LeftRightImpl();
		
		right.m1();
		
		Left left = new LeftRightImpl();
		
		left.m1(100);
		
		
		System.out.println(Right.x);
		
		System.out.println(Left.x);
	}

}

package com.rsg.variables;

public class UnInitializeArrayDemo {
	
	int[] a;
	
	int[] b = new int[5];

	public static void main(String[] args) {
		
		UnInitializeArrayDemo unInitializeArrayDemo = new UnInitializeArrayDemo();
		
		System.out.println(unInitializeArrayDemo.a); // null
		
	//	System.out.println(unInitializeArrayDemo.a[0]);
		
		System.out.println(unInitializeArrayDemo.b);
		
		System.out.println(unInitializeArrayDemo);
		
		Object obj = null;

	}

}

package com.rsg.collection;

public class Test {

	public static void main(String[] args) {
		
		
		int[] a = new int[5];
		
		System.out.println(a.length);
		
		String inputString = "Gourav";
		
		
		
		String reversed = "";

		//Without using Array - Without using in-built methods
				for (int i=inputString.length()-1; i>=0; i--) {
					reversed = reversed + inputString.charAt(i);     
				}
				System.out.println("Without using in-built method, the Reversed String is : " + reversed);
	}

}

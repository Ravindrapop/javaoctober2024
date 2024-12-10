package com.rsg.flowcontroll;

public class SumOfDigits {

	public static void main(String[] args) {
		
		int number = 3265985;
		
		
		int sum = 0;
		
		while(number>0) {
		int	r = number%10;   
		sum = sum+r;        
		number=number/10;  
		
		}
		
		System.out.println("The sum of digits is : "+sum);

	}

}

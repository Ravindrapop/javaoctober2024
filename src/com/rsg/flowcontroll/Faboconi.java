package com.rsg.flowcontroll;

import java.util.Scanner;

public class Faboconi {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number:");
        int num=sc.nextInt();
                int a = 0, b = 1;
                System.out.println("Fibonacci Series till " + num + " terms:");  // 10
                  for (int i = 1; i <= num; i++) {   // i = 10
                  System.out.print(a + ", ");   // 21
                  int c = a + b;      // c = 34
                  a = b;    // a = 21
                  b = c;  // b = 34
                }
    }
}
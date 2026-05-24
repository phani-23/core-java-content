package com.logicalstatements.loops;

import java.util.Scanner;

public class TestDemo9 {
	
	static long findFactorial(int n) {
		long fact=1;
		for(int i=n;i>=1;i--) {
			fact=fact*i;
		}
		return fact;
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number: ");
		int n=sc.nextInt();
		long factorialNum= findFactorial(n);
		System.out.println("factorial of given number: "+factorialNum);
		sc.close();

	}

}

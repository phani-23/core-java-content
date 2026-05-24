package com.logicalstatements.loops;

import java.util.Scanner;

public class TestDemo10 {
	
	static int findFactorial(int n) {
		if(n==0||n==1) {
			return 1;
		}
		return n*findFactorial(n-1);
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number: ");
		int n=sc.nextInt();
		long factorialNum=findFactorial(n);
		System.out.println("factorial of given number: "+factorialNum);
		sc.close();
	}

}

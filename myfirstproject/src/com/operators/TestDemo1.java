package com.operators;

import java.util.Scanner;

public class TestDemo1 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("enter a number: ");
			int a =sc.nextInt();
			System.out.println("enter b number:");
			int b= sc.nextInt();
			
			System.out.println("addition of two numbers:"+(a+b));
			System.out.println("difference of two numbers:"+(a-b));
			System.out.println("multiplication of two numbers:"+a*b);
			System.out.println("quotient of two numbers:"+a/b);
			System.out.println("reminder of two numbers:"+a%b);
		}

	}

}

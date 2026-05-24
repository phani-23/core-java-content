package com.langfun.methods;

import java.util.Scanner;

public class TestDemo6 {
	
	static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("main method started!");
		double add=addition();
		double diff=subtraction();
		
		System.out.println(add*diff);

	}
	static double addition() {
		System.out.println("enter a number:");
		int a=sc.nextInt();
		
		System.out.println("enter b number:");
		int b=sc.nextInt();
		
		int sum=a+b;
		
		return sum;
	}
	
static float subtraction() {
		System.out.println("enter a number:");
		int a=sc.nextInt();
		
		System.out.println("enter b number:");
		float b=sc.nextInt();
		
		float diff=b-a;
		
		return diff;
	}

}

package com.oops;

import java.util.Scanner;

public class TestPLDemo3 {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc= new Scanner(System.in);
		
		System.out.println("***********Rectangle Area**************");
		System.out.println("enter l value: ");
		long l=sc.nextLong();
		System.out.println("enter b value: ");
		long b=sc.nextLong();
		System.out.println("Reactangle Area: "+findArea(l,b));
		
		System.out.println("***********Square Area****************");
		System.out.println("enter s value: ");
		int s=sc.nextInt();
		System.out.println("Square Area: "+findArea(s));
		
		System.out.println("***********Radius Area****************");
		System.out.println("enter r value: ");
		int r=sc.nextInt();
		System.out.println("Radius Area: "+findArea(r));
		sc.close();
	}
	static double findArea(long l,long b) {
		return l*b;
	}
	
	static int findArea(int s) {
		return s*s;
	}
	static double findArea(double r) {
		return Math.PI*r*r;
	}
}

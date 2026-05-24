package com.langfun.methods;

public class TestDemo2 {

	public static void main(String[] args) {
		System.out.println("main method started");
		addition(2,3);
		subtraction(500,200);
		multiplication(10,25.5);
		division(190,7);
		modulus(9,2);
		getName("phani krishna");
		
		System.out.println("main method ended");

	}
	
	static void getName(String name) {
		System.out.println("Student name:"+name);
	}
	
	static void modulus(double x, double y) {
		System.out.println("hello modulus");
		System.out.println(x%y);
	}
	
	static void division(int a,int b) {
		System.out.println("hello division");
		System.out.println(a/b);
	}
	
	static void multiplication(int a, double b) {
		System.out.println("hello multiplication");
		System.out.println(b*a);
	}
	
	static void subtraction(long i,long j) {
		System.out.println("hello subtraction");
		System.out.println(i-j);
	}
	
	static void addition(int i,int j){
		System.out.println("hello addition");
		System.out.println(i+j);
	}
}

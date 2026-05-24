package com.operators;

public class TestDemo8 {

	public static void main(String[] args) {
		System.out.println("main method started");
		
		int a=100;
		int b=500;
		int c=300;
		
		System.out.println("----------logical AND----------------");
		System.out.println(true && true);
		System.out.println(true && false);
//		System.out.println(false && true);
//		System.out.println(false && false);
		System.out.println("------------------------------");
		System.out.println(a<b && b>c);
		System.out.println("-----------logical OR----------------");
//		System.out.println(true || true);
//		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		System.out.println("------------------------------");
		System.out.println(a<b || b>c);
		System.out.println("----------logical NOT--------------------");
		System.out.println(!(a>b));
	}

}

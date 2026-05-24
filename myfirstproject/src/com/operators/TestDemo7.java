package com.operators;

public class TestDemo7 {

	public static void main(String[] args) {
		int a=5;
		int b=6;
		
		System.out.println(a++ + ++a + b++ + ++b);
		
		System.out.println(--a + ++b - ++a - b-- + ++b);
		
		System.out.println("A value :"+a);
		System.out.println("B balue :"+b);

	}

}

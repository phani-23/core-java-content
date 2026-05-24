package com.operators;

public class TestDemo15 {

	public static void main(String[] args) {
		
		System.out.println("main method started!!");
		
		Integer i1=10;
		String name="phani";
		System.out.println(name instanceof String);
		System.out.println(name instanceof Object);
		
		System.out.println("***********************");
		System.out.println(i1 instanceof Integer);
		System.out.println(i1 instanceof Number);
		System.out.println(i1 instanceof Object);
		
		System.out.println("************************");
		System.out.println(null instanceof Integer);
		System.out.println(null instanceof String );
	}

}

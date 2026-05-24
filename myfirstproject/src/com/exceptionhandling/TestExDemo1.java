package com.exceptionhandling;

public class TestExDemo1 {

	public static void main(String[] args) {
		System.out.println("main method started");
		try {
			System.out.println(10.5/0);
			System.out.println(0.0/0);
			System.out.println(0/0);
			System.out.println(10/0);
		}catch(Exception e) {
			System.err.println(e.getMessage());
			System.err.println(e.toString());
			System.err.println("in catch");
			e.printStackTrace();
		}
		System.out.println("main method ended");

	}

}

package com.stringHandling;

public class TestStrDemo28 {

	public static void main(String[] args) {
		System.out.println("main method started");
		String s1="Java is Simple";
		System.out.println(s1.substring(5));
		System.out.println(s1.substring(0, 7));
		
		System.out.println(s1.subSequence(0, 4));

	}

}

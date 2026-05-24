package com.stringHandling;

public class TestStrDemo20 {

	public static void main(String[] args) {
		String s1="Phani Krishna";
		
		char[] ach=new char[127];
		
		s1.getChars(4, 10, ach, 0);
		
		System.out.println(ach);

	}

}

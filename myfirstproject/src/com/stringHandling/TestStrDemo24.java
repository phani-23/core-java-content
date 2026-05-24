package com.stringHandling;

public class TestStrDemo24 {

	public static void main(String[] args) {
		System.out.println("main method started");
		
		String s1="";
		String s2=" ";
//		String s3=null;
		
		System.out.println(s1.isEmpty());
		System.out.println(s1.isBlank());
		
		System.out.println(s2.isEmpty());
		System.out.println(s2.isBlank());
		
//		System.out.println(s3.isEmpty()); // NPE
//		System.out.println(s3.isBlank()); // NPE

	}

}

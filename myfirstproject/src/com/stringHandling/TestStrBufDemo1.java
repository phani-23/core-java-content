package com.stringHandling;

public class TestStrBufDemo1 {

	public static void main(String[] args) {
		System.out.println("main method started");
		
		StringBuffer sb1=new StringBuffer("Hello");
		System.out.println(sb1);
		
		StringBuffer sb=new StringBuffer();
		System.out.println(sb);
		System.out.println(sb.capacity());
		System.out.println("main method ended");

	}

}

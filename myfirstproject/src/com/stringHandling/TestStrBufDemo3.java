package com.stringHandling;

public class TestStrBufDemo3 {

	public static void main(String[] args) {
		
		StringBuffer sb1=new StringBuffer();
		System.out.println(sb1.length());
		System.out.println(sb1.capacity());
		
		StringBuffer sb2=new StringBuffer("Phani");
		System.out.println(sb2.length());
		System.out.println(sb2.capacity());
		
		StringBuffer sb3=new StringBuffer();
		sb3.append("PhaniisJavaDeveloPhaniisJavaDeveloP");
		sb3.append("PhaniisJavaDeveloPhaniisJavaDeveloperP");
		sb3.append("P");
		System.out.println(sb3.length());
		System.out.println(sb3.capacity());

	}

}

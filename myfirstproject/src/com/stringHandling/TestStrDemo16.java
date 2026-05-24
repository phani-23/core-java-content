package com.stringHandling;

public class TestStrDemo16 {

	public static void main(String[] args) {
		String Str1="Java";
		String Str2="Java";
		
		System.out.println(Str1.contentEquals(Str2));
		
		char[] c= {'p','h','a','n','i'};
		String s=String.copyValueOf(c);
		System.out.println(s);
	}

}

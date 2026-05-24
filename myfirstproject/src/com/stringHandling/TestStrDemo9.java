package com.stringHandling;

public class TestStrDemo9 {

	public static void main(String[] args) {
		String s1="Phani";
		String s2="Krishna";
		String s3=s1+s2;
		System.out.println(s3);
		
		String s4="PhaniKrishna";
		System.out.println(s3==s4);
		
		String s5=s4;
		System.out.println(s5);
		System.out.println(s4==s5);
	}

}

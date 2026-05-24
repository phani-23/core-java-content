package com.stringHandling;

public class TestStrDemo14 {

	public static void main(String[] args) {
		String str="PhaniKrishna";
		System.out.println(str.codePointAt(5));
		System.out.println(str.codePointBefore(5));
		System.out.println(str.codePointCount(2, 5));
		
		String str1="Phani";
		String str2="Krishna";
		
		System.out.println(str1.compareTo(str2));
		
		String str3="Java";
		String str4="java";
		System.out.println(str3.compareTo(str4));
		System.out.println(str3.compareToIgnoreCase(str4));
		
		String str5="Srikanth";
		String str6="Srikanth java";
		System.out.println(str5.compareTo(str6));
	}

}

package com.stringHandling;

public class TestStrDemo26 {

	public static void main(String[] args) {

		String str1="Phani";
		String str2="Krishna";
		String str3="Java is Simple";
		String str4="Vcube";
		
		String nstr=String.join("-", str1,str2,str3,str4,"Hello","Good Morning");
		System.out.println(nstr);
	}

}

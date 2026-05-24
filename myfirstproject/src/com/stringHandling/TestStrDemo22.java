package com.stringHandling;

public class TestStrDemo22 {

	public static void main(String[] args) {
		String str = "Phani Krishna is Java Developer Phani Krishna is Java Developer";
		System.out.println(str.indexOf('a'));
		System.out.println(str.indexOf('a', str.indexOf('a') + 1));
		System.out.println(str.indexOf('a',str.indexOf('a', str.indexOf('a') + 1)+1));
		System.out.println(str.indexOf('a',str.indexOf('a',str.indexOf('a', str.indexOf('a') + 1)+1)+1));
		
		
		System.out.println(str.indexOf("ish"));
		System.out.println(str.indexOf("ish",str.indexOf("ish")+1));
	}

}

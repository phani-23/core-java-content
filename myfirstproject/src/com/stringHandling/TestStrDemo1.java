package com.stringHandling;
//Reverse of a string.
public class TestStrDemo1 {

	public static void main(String[] args) {
		String str="Mom";
		String rstr="";
		for(int i=0;i<str.length();i++) {
			char c=str.charAt(i);
			rstr=c+rstr;
		}
		System.out.println(rstr);

	}

}

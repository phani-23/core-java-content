package com.stringHandling;

public class TestStrDemo34 {

	public static void main(String[] args) {
		
		String a="100";
		System.out.println(a+100);
		int a1=Integer.parseInt(a);
		System.out.println(a1+100);

		
		String b="9972677655";
		System.out.println(b+10);
		long b1=Long.parseLong(b);
		System.out.println(b1+10);
		
		int a2=100;
		long b2=200L;
		float c2=300F;
		
		System.out.println(""+a2+b2+c2);
		String a3=String.valueOf(a2);
		String b3=String.valueOf(b2);
		String c3=String.valueOf(c2);
		System.out.println(a3+b3+c3);
		

	}

}

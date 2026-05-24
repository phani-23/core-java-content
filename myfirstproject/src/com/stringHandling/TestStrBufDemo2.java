package com.stringHandling;

public class TestStrBufDemo2 {

	public static void main(String[] args) {
		
		String s=new String("Phani");
		s=s.concat("Java");
		System.out.println(s);
		
		StringBuffer sb=new StringBuffer("Phani");
		sb.append("Java");
		sb.append("Developer");
		System.out.println(sb);
		
		StringBuilder sb1=new StringBuilder("Phani");
		sb1.append("Java");
		sb1.append("Developer");
		System.out.println(sb);

	}

}

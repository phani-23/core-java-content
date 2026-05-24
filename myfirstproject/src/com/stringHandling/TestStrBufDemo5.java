package com.stringHandling;

public class TestStrBufDemo5 {

	public static void main(String[] args) {
		
		StringBuffer sb1=new StringBuffer("Phani");
		System.out.println(sb1.delete(0, 2));
		System.out.println(sb1.deleteCharAt(0));
		System.out.println(sb1);
		
		System.out.println(sb1.reverse());
		
		StringBuffer sb2=new StringBuffer();
		System.out.println(sb2.capacity());
		sb2.ensureCapacity(100);
		System.out.println(sb2.capacity());
	}

}

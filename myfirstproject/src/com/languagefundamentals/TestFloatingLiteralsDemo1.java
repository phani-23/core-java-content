package com.languagefundamentals;

// Floating Literals

public class TestFloatingLiteralsDemo1 {

	public static void main(String[] args) {
		float f1=100;
		//float f2=35.5;//Type mismatch: cannot convert from double to float
		float f3=0123;
		//float f4=0123.5;//Type mismatch: cannot convert from double to float
		double d1=56.789D;
		double d2=56.789F;
		
		float f5=0123.5f;
		float f6=123.5f;
		float f7=567.0f;
		float f8=0x123;
		//float f9=0x123.5f;//Invalid hex literal number
		//float f10=0x123.5;//Invalid hex literal number
		float f11=0xabc;

		System.out.println(d1);
		System.out.println(d2);
		System.out.println(f1);
//		System.out.println(f2);
		System.out.println(f3);
//		System.out.println(f4);
		System.out.println(f5);
		System.out.println(f6);
		System.out.println(f7);
		System.out.println(f8);
		//System.out.println(f9);
		//System.out.println(f10);
		System.out.println(f11);
		

	}

}

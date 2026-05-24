package com.languagefundamentals;

// Integral Literals

public class TestLiteralsDemo1 extends Object {

	public static void main(String[] args) {
		
		TestLiteralsDemo1 t1=new TestLiteralsDemo1();
		System.out.println(t1);
		System.out.println(t1.hashCode());
		int a12=0x79fc0f2f;
		System.out.println(a12);
		System.out.println("******************************");
		
		
	int a1=123;
	int a2=56789;
	int a3=789;
	
	//any number starts with zero consider as octal number.
	int a4=0123;
	int a5=0345;
	int a6=0567;
	//any number starts with 0x consider as hexadecimal number.
	int a7=0x876;
	int a8=0x45a;
	int a9=0xabc;
	int a10=0xbee;
	int a11=0xDAD;
	
	
	System.out.println(a1);
	System.out.println(a2);
	System.out.println(a3);
	System.out.println(a4);
	System.out.println(a5);
	System.out.println(a6);
	System.out.println(a7);
	System.out.println(a8);
	System.out.println(a9);
	System.out.println(a10);
	System.out.println(a11);
	
	}

}

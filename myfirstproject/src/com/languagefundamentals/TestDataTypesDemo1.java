package com.languagefundamentals;

public class TestDataTypesDemo1 {
	
	byte b=(byte) 258; //explicit type casting
	short s=32678; 
	//this literal is out of range
	int i=(int)2147483648L;
	long l=582149595585645865L;//L is mandatory
	
	float f=56.7534985994F;//F is mandatory
	double d=56.7534985994D;//D is not mandatory
	
	//2bytes = 65535
	//2bytes and the range is 0 to 65535
	char c='A';
	char c1='@';
	char c2='1';
	char c3=65535;//ASCII code --> 65=A , 66=B , 67=C.... 90=Z 
	char c4='\u0040';//unicode
	
	boolean boo=true;
//	boolean boo1="true";Type mismatch: cannot convert from String to boolean
//	boolean boo2="false";Type mismatch: cannot convert from String to boolean
//	boolean boo3=TRUE;Type mismatch: cannot convert from String to boolean
//	boolean boo4=FALSE;Type mismatch: cannot convert from String to boolean
//	boolean boo5=True;Type mismatch: cannot convert from String to boolean
//	boolean boo6=False;Type mismatch: cannot convert from String to boolean
//	boolean boo7=0;Type mismatch: cannot convert from String to boolean
//	boolean boo8=1;Type mismatch: cannot convert from String to boolean
	public static void main(String[] args) {
		System.out.println("main method started!");
		TestDataTypesDemo1 s1=new TestDataTypesDemo1();
		
		System.out.println("byte value: " +s1.b);//0
		System.out.println("short value: " +s1.s);//0
		System.out.println("int value: " +s1.i);//0
		System.out.println("long value: " +s1.l);//0
		
		System.out.println("float value: " +s1.f);//0.0
		System.out.println("double value: " +s1.d);//0.0
		
		System.out.println("char value: " +s1.c);
		System.out.println("char value: " +s1.c1);
		System.out.println("char value: " +s1.c2);
		System.out.println("char value: " +s1.c3);
		System.out.println("char value: " +s1.c4);
		System.out.println("boolean value: " +s1.boo);//false
		
		if(s1.boo) {
			System.out.println("hello");
		}

	}

}

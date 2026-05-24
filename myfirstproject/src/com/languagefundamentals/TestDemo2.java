package com.languagefundamentals;

import java.math.BigInteger;
import java.math.BigDecimal;

class Dog{
	String name="puppy";
	String breed="lab";
	
}

public class TestDemo2 {
	
	String str="phani";// String Literals
	String str1=new String("Java");// String with new keyword or object
	
	
	BigInteger bi1=new BigInteger("8794561867954546645");
	BigInteger bi2=new BigInteger("85247963210458795254565");
	
	BigDecimal bd1=new BigDecimal("300");
	BigDecimal bd2=new BigDecimal("400");
	
	Dog dog=new Dog();
//	Dog dog="puppy";
	
//wrapper object data types
//Auto-Boxing
//converting primitive data to wrapper object data types is called auto boxing.
//converting wrapper object data to primitive data types is called auto-unboxing
	Byte b=10;
	byte b2=b;
	
	Short s=100;
	
	Integer i=256;
	Long l=789546213546L;
	
	Character c='A';
	Boolean b1=false;
	
	Float f=5.6F;
	Double d=7.5D;

	public static void main(String[] args) {
		TestDemo2 t=new TestDemo2();
		System.out.println("Predefined wrapper object data types");
		System.out.println("Byte value:"+t.b);
		System.out.println("Byte value:"+t.b2);
		System.out.println("Short value:"+t.s);
		System.out.println("Integer value:"+t.i);
		System.out.println("Long value:"+t.l);
		System.out.println("Character value:"+t.c);
		System.out.println("Boolean value:"+t.b1);
		System.out.println("Float value:"+t.f);
		System.out.println("Double value:"+t.d);
		System.out.println("predefined and userdefined data types");
		System.out.println("String value:"+t.str);
		System.out.println("String value:"+t.str1);
//		System.out.println("value:"+t.dog);
		System.out.println("********BigInteger&BigDecimal data************");
		System.out.println(t.bi1);
		System.out.println(t.bi2);
		
		System.out.println(t.bi1.add(t.bi2));
		System.out.println(t.bi1.multiply(t.bi2));
		System.out.println(t.bi1.subtract(t.bi2));
		System.out.println(t.bi1.divide(t.bi2));
		System.out.println(t.bi1.mod(t.bi2));
		
		System.out.println(t.bd1);
		System.out.println(t.bd2);
		
		System.out.println("***********dog info");
		System.out.println(t.dog.name);//Address of the dog class
		System.out.println(t.dog.breed);
	}

}

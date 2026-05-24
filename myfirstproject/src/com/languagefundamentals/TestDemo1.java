package com.languagefundamentals;

public class TestDemo1 {
	
	int roll_No=123;
	String name="phani";

	public static void main(String[] phani) {
		System.out.println("main method started!!");
		TestDemo1 t=new TestDemo1();
		System.out.println(t.roll_No);
		System.out.println(t.name);
		t.method1();
		System.out.println("main method ended!!");
	}
	
	void method1() {
		System.out.println("method 1 called");
	}

}
//identifiers in above program
// com  ,  language fundamentals  , TestDemo1  ,  roll_No  , name
//main  ,  phani   ,   t    ,  method1  , String  ,  System  
//out  ,  println


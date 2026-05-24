package com.langfun.methods;

public class TestDemo1 {
	
	//instance method
	void hello() {
		System.out.println("hello, good evening");
	}
	
	//static method
	static void welcome() {
		System.out.println("welcome to java world!");
	}
	
	//main method with no return type + with arguments
	public static void main(String[] args) {
		System.out.println("main method started !");
		welcome();
		TestDemo1 t=new TestDemo1();
		t.hello();
		
		System.out.println("main method ended!");
		
	}
	

}

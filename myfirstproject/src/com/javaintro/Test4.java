package com.javaintro;

public class Test4 {
	
	{
		System.out.println("instance block1 called");
	}
	
	{
		System.out.println("instance block2 called");
	}
	
	static {
		System.out.println("static block1 called");
	}
	
	static {
		System.out.println("static block2 called");
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		Test4 t=new Test4();
		method1();
		t.method2();

	}
	
	static void method1() {
		System.out.println("method 1 called");
	}
	
	void method2() {
		System.out.println("method 2 called");
	}

}

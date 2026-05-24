package com.javaintro;

public class Test5 {

	public static void main(String[] args) {
		System.out.println("main method started");
		method1();

	}
// in static we cannot call instance methods directly, we must need to create objects
	static void method1() {
		System.out.println("method 1 called!");
		Test5 t=new Test5();
		t.method2();
	}
//	yes we can call instance methods in instance method directly!
	void method2() {
		System.out.println("method 2 called!");
		method3();
	}
	
	void method3() {
		System.out.println("method 3 called!");
		method4();
	}
	static void method4() {
		System.out.println("method 4 called!");
	}
}

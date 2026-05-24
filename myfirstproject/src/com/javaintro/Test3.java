package com.javaintro;

public class Test3 {
//	static method
	static void welcome() {
		System.out.println("welcome method called!");
	}
	
//  main method
	public static void main(String[] args) {
		System.out.println("main method started!");
		
		Test3 t=new Test3();
		
//		calling the static method
		welcome();
//		calling the hello method
		t.hello();
		
		System.out.println("main method ended!");

	}
	
//	instance method
	void hello(){
		System.out.println("Hello method called!");
		
	}

}

package com.javaintro;

public class Student {
	int sid;
	String sname;
	
	static int instId=423;
	static String instName="Vcube";
	
	//static block
	static {
		System.out.println("static block called");
	}
	
	//static method
	
		public static void welcome() {
			System.out.println("welcome: "+Thread.currentThread().getName());
			System.out.println("Welcome to Vcube!");
		}

	//instance method
	void hello() {
		System.out.println("hello: "+Thread.currentThread().getName());
		System.out.println("Hello Vcube students!!");
	}
	//main method

	public static void main(String[] args) {
		System.out.println("main method started");
		System.out.println("main: "+Thread.currentThread().getName());
		System.out.println("Vcube student Info");
		Student s1=new Student();
		welcome();
		s1.hello();
		System.out.println(instId);
		System.out.println(instName);
		System.out.println(s1.sid);
		System.out.println(s1.sname);
		System.out.println("main method ended");

	}
	
}

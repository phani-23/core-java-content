package com.constructors;

class Srikanth extends Teacher{
	
	Srikanth(){
		super("java","phani",100000,22);
//		System.out.println("no arg from srikanth");
	}
	
	public static void main(String[] args) {
		System.out.println("main method from Srikanth");
		Srikanth s1=new Srikanth();
		System.out.println(s1.name);
		System.out.println(s1.subject);
		System.out.println(s1.salary);
		System.out.println(s1.age);
	}
}

public class Teacher {
	
	String subject;
	String name;
	double salary;
	int age;
	
	Teacher(){
		System.out.println("no arg constructor from teacher");
	}
	
	public Teacher(String subject, String name, double salary, int age) {
		super();
		System.out.println("parameterized constructor called");
		this.subject = subject;
		this.name = name;
		this.salary = salary;
		this.age = age;
	}



	public static void main(String[] args) {
		System.out.println("main method from teacher!!");

	}

}

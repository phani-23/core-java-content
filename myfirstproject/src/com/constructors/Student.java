package com.constructors;

public class Student {
	
	int sid;
	String sname;
	long phone;
	int age;
	String city;
	
	Student(int sid,String sname){
		System.out.println("parameterized constructor called!!");
		this.sid=sid;
		this.sname=sname;
		
	}
	
	Student(long phone,int age,String city){
		System.out.println("paramterized constructor called!!!");
		this.phone=phone;
		this.age=age;
		this.city=city;
		
		
	}
	
	
	Student(){
		System.out.println("no arg constructor called!!");
	}

	public static void main(String[] args) {
		System.out.println("main method started!!");
		Student s1=new Student(1,"phani");
		s1.display();
		
		Student s2=new Student();
		s2.display();
		
		Student s3=new Student(6281648268L,22,"vizag");
		s3.display();
	}
	
	void display() {
		System.out.println("***********************");
		System.out.println("Student ID: "+sid);
		System.out.println("Student name: "+sname);
		System.out.println("student phone: "+phone);
		System.out.println("student age: "+age);
		System.out.println("student city: "+city);
		System.out.println("*************************");
	}

}

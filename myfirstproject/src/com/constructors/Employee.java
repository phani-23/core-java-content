package com.constructors;

public class Employee {
	
	int eid;
	String ename;
	double esal;
	long phone;
	int age;
	
	Employee(){
		this(1,"unknown");//calling two argument constructor
		System.out.println("no arg constructor called!");
	}
	
	Employee(int eid,String ename){
		System.out.println("two arg constructor called!!");
		this.eid=eid;
		this.ename=ename;
	}
	
	Employee(double esal,long phone,int age){
		System.out.println("three arg constructor called!!");
		this.esal=esal;
		this.phone=phone;
		this.age=age;
	}

	public static void main(String[] args) {
		System.out.println("main method started!!");
		
		Employee emp1=new Employee();
		emp1.showDetails();
		
		Employee emp2=new Employee(2,"phani");
		emp2.showDetails();
		
		Employee emp3=new Employee(20000.00,9550638095L,22);
		emp3.showDetails();

	}
	
	void showDetails() {
		System.out.println("*************************");
		System.out.println("employee ID: "+eid);
		System.out.println("employee name: "+ename);
		System.out.println("employee salary: "+esal);
		System.out.println("employee phone no: "+phone);
		System.out.println("employee age: "+age);
		System.out.println("**************************");
	}
}

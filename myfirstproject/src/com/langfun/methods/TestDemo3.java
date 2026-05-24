package com.langfun.methods;

import java.util.Scanner;

public class TestDemo3 {
	
	void getFullname(String fname,String lname){
		System.out.println("full name: "+fname+" "+lname);
		
	}
	
	void getAge(int age) {
		System.out.println("your age:"+age);
	}
	
	void getGenderDetails(char c) {
		System.out.println("gender info: "+c);
	}
	
	void getFeeInfo(double fee){
		System.out.println("fee info:"+fee);
	}
	
	public static void main(String[] args) {
		System.out.println("main method started");
		TestDemo3 t3=new TestDemo3();
		
	//	TestDemo1 t1=new TestDemo1();
	//	String s=new String();
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("enter first name:");
			String fn=sc.next();
			System.out.println("enter last name:");
			String ln=sc.next();
		
			System.out.println("enter age:");
			int age=sc.nextInt();
			
			System.out.println("enter feeinfo: ");
			double fee=sc.nextDouble();
			
			System.out.println("enter gender : ");
			char gen=sc.next().charAt(0);
			
			t3.getFullname(fn, ln);
			
			t3.getAge(age);
			
			t3.getFeeInfo(fee);
			
			
			t3.getGenderDetails(gen);
		}
		

	}

}

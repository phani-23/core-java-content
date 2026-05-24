package com.oops;

public class TestPLDemo2 {
	
	void addition() {
		System.out.println("addition method called with no args");
	}
	
//	void addition(int i) {
//		System.out.println("addition method called with int args: "+i);
//	}
	
	void addition(float i) {
		System.out.println("addition method called with float args: "+i);
	}
	
	void addition(long i) {
		System.out.println("addition method called with long args: "+i);
	}
	
	void addition(double i) {
		System.out.println("addition method called with double args: "+i);
	}
	
	void addition(float i,int j) {
		System.out.println("addition method called with float and int args: "+i +","+j);
	}
	
	void addition(int i,int j) {
		System.out.println("addition method called with int and int args: "+i +","+j);
	}
	void addition(long i,int j) {
		System.out.println("addition method called with long and int args: "+i +","+j);
	}
	void addition(int i,float j) {
		System.out.println("addition method called with int and float args: "+i +","+j);
	}

	 void main(String[] args) {
		System.out.println("main method started");
		addition();
		addition(10f);
		addition(10,20);
		System.out.println("main method ended");

	}

}

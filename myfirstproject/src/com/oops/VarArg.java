package com.oops;

public class VarArg {

	public static void main(String[] args) {
		System.out.println("main method started");
		addition();
		addition(10);
		addition(10,20);
		addition(10,20,30);
		addition(10,20,30,40);
		addition(10,20,30,40,50);

	}
	public static void addition(int... i) {
		int sum=0;
		
		for(int e:i) {
			sum=sum+e;
		}
		System.out.println("sum: "+sum);
	}
}

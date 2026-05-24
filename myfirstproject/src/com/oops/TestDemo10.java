package com.oops;

public class TestDemo10 {

	public static void main(String[] args) {
		System.out.println("main method started");
		
		addition();
		addition(10);
		addition(10,20);
		addition(10,20,30);
		addition(10,20,30,40);
		addition(10,20,30,40,50);

	}

	public static void addition() {
		System.out.println("addition with no arg");
	}
	
	public static void addition(int i) {
		System.out.println(i+0);
	}
	public static void addition(int i,int j) {
		System.out.println(i+j);
	}
	public static void addition(int i,int j,int k) {
		System.out.println(i+j+k);
	}
	public static void addition(int i,int j,int k,int l) {
		System.out.println(i+j+k+l);
	}
	public static void addition(int i,int j,int k,int l,int m) {
		System.out.println(i+j+k+l+m);
	}
}

package com.multithreading;

public class TestMTDemo1 extends Thread {

	public static void main(String[] args) {
		System.out.println("main method started");
		System.out.println(Thread.currentThread());
		TestMTDemo1 t=new TestMTDemo1();
		t.start();
		 for(int i=0;i<=10;i++) {
			 System.out.println("main: "+i);
		 }
		 
	}
	
	public void run(){
		for(int i=0;i<=10;i++) {
			System.out.println("Run: "+i);
		}
		System.out.println(Thread.currentThread().getName());
	}
}

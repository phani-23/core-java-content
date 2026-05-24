package com.multithreading;

public class TestMTDemo3 extends Thread {

	public static void main(String[] args) {
		System.out.println("main method started!!");
		System.out.println(TestMTDemo3.currentThread());
		TestMTDemo3 t=new TestMTDemo3();
		t.start();
		for(int i=1;i<=10;i++) {
			System.out.println("main: "+i);
		}
		
		System.out.println("main method ended");
	}
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println("run: "+i);
		}
	}
}

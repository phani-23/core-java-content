package com.multithreading;

public class TestMTDemo2 implements Runnable {

	public static void main(String[] args) {
		TestMTDemo2 t1=new TestMTDemo2();
		Thread t2=new Thread(t1);
		t2.start();
		for(int i=0;i<=10;i++) {
			System.out.println("main: "+i);
		}

	}
	public void run() {
		for(int i=0;i<=10;i++) {
			System.out.println("Run: "+i);
		}
	}
}

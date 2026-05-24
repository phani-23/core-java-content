package com.multithreading;

class myThread extends Thread {
	@Override
	public void run() {
		System.out.println("Thread is running");
	}
}

class myThread2 implements Runnable {

	@Override
	public void run() {
		System.out.println("Thread running using runnable");
	}

}

class NumberThread extends Thread {
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(Thread.currentThread().getName() + " : " + i);
		}

	}

}

public class TestMTDemo5 {

	public static void main(String[] args) {
		myThread t = new myThread();
		t.start();

		Thread t2 = new Thread(new myThread2());
		t2.start();

		NumberThread t3 = new NumberThread();
		NumberThread t4 = new NumberThread();

		t3.start();
		t4.start();

	}

}

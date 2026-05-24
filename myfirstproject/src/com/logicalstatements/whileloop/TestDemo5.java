package com.logicalstatements.whileloop;

public class TestDemo5 {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("main method started");
		int a=10;
		while(a>5) {
			System.out.println("hello");
			Thread.sleep(1000);
			a--;
		}

	}

}

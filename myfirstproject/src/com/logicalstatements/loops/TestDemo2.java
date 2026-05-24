package com.logicalstatements.loops;

public class TestDemo2 {

	public static void main(String[] args) {
		System.out.println("main method started");
		for (int i = 100; i >= 0; i--) {
			if (i % 2 == 1 && i != 0) {
				System.out.print(i + " ");
			}
		}

	}

}

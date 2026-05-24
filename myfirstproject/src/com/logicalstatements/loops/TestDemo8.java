package com.logicalstatements.loops;

import java.util.Scanner;

public class TestDemo8 {

	void main() {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number: ");
		int n = sc.nextInt();
		System.out.println("up to where you want to print: ");
		int end = sc.nextInt();
		for (int i = 1; i <= end; i++) {
			System.out.println(n + " X " + i + " = " + n * i);
		}
		sc.close();
	}

}

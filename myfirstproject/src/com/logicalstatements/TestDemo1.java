package com.logicalstatements;

import java.util.Scanner;

public class TestDemo1 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("enter your age: ");
			int age = sc.nextInt();
			if (age >= 18) {
				System.out.println("eligible for voting");
				System.out.println("eligible for driving");
			} else {
				System.out.println("not eligible");
			}
		}

	}

}

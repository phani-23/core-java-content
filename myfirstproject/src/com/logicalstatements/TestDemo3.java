package com.logicalstatements;

import java.util.Scanner;

public class TestDemo3 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("enter your age: ");
			int age = sc.nextInt();
			if (age > 100 || age < 0) {
				System.out.println("invalid data given to the age");
			} else if (age >= 60) {
				System.out.println("hello senior citizens");
			} else if (age >= 35) {
				System.out.println("hello middle aged people");
			} else if (age >= 20) {
				System.out.println("hello youngsters");
			} else if (age >= 13) {
				System.out.println("hello teenagers");
			} else if (age >= 5) {
				System.out.println("hello children");
			} else if (age >= 0) {
				System.out.println("hello kids");
			}
		}

	}

}

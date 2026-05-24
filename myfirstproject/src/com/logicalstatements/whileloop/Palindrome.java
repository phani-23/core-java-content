package com.logicalstatements.whileloop;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number: ");
		int n = sc.nextInt();
		int r = 0;
		int rev = 0;
		int temp = n;

		while (n > 0) {
			r = n % 10;
			n = n / 10;
			rev = rev * 10 + r;
		}

		System.out.println("the reverse of number is: " + rev);

		if (rev == temp) {
			System.out.println("the given number is palindrome");
		} else {
			System.out.println("the given number is not a palindrome");
		}
		sc.close();
	}

}

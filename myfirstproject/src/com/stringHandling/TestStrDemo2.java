package com.stringHandling;

import java.util.Scanner;

public class TestStrDemo2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s = sc.next();

		String revS = "";

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			revS = c + revS;
		}

		System.out.println("The reverse of a string is: " + revS);

		if (s.equalsIgnoreCase(revS)) {
			System.out.println("The Given String is Palindrome!!!");
		} else {
			System.out.println("The given string is not a Palindrome!!");
		}
		sc.close();
	}

}

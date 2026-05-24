package com.stringHandling;

import java.util.Scanner;

public class TestStrDemo31 {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);

		System.out.println("enter a string: ");
		String str = sc.nextLine();
		str = str.toLowerCase();

		char[] ach = str.toCharArray();

		int letterCount = 0;
		int digitCount = 0;
		int specialCharCount = 0;
		int vowelsCount=0;
		int consonantsCount=0;

		for (char c : ach) {
			if (Character.isLetter(c)) {
				letterCount++;
				if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
					vowelsCount++;
				}else {
					consonantsCount++;
				}
			} else if (Character.isDigit(c)) {
				digitCount++;
			} else {
				specialCharCount++;
			}
		}

		System.out.println("Letter count: " + letterCount);
		System.out.println("Vowels Count: "+vowelsCount);
		System.out.println("consonants Count: "+consonantsCount);
		System.out.println("Digit count: " + digitCount);
		System.out.println("special Char count: " + specialCharCount);
		sc.close();
	}

}

package com.stringHandling;

public class TestStrDemo3 {

	public static void main(String[] args) {
		String[] s = { "Madam", "Mom", "Dad", "Phani" };
		for (int i = 0; i < s.length; i++) {
			String str = s[i].toLowerCase();
			String rstr = "";
			for (int j = 0; j < str.length(); j++) {
				char c = str.charAt(j);
				rstr = c + rstr;
			}
			System.out.println("The reverse of string is : " + rstr);

			if (str.equals(rstr)) {
				System.out.println("The Given string is Palindrome!!");
			} else {
				System.out.println("The given string is not a palindrome!!");
			}
			System.out.println();
		}
	}
}

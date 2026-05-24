package com.logicalstatements.loops;

import java.util.Scanner;

public class TestDemo11 {

	 void main() {
		System.out.println("main method started");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a String for palindrome: ");
		String str=sc.next();
		boolean isPalindrome=true;
		for(int i=0;i<str.length();i++) {
			 if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
	                isPalindrome = false;
	                break;
	            }
		}
		 System.out.println(isPalindrome ? "Palindrome" : "Not a palindrome");
		sc.close();
	}

}

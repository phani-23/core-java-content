package com.stringHandling;

import java.util.Arrays;

public class TestStrDemo29 {

	public static void main(String[] args) {
		String s1="Race";
		String s2="Care";
		
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		
		if(s1.length()!=s2.length()) {
			System.out.println("both are not anagrams");
			return;
		}
		
		char[] ch1=s1.toCharArray();
		char[] ch2=s2.toCharArray();
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		if(Arrays.equals(ch1, ch2)) {
			System.out.println("The Given String is Anagram");
		}else {
			System.out.println("It is not Anagram");
		}
		

	}

}

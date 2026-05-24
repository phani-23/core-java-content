package com.stringHandling;

public class TestStrDemo27 {

	public static void main(String[] args) {
		
		String str="Java-is-simple-in-vcube-at-Jntu-Hyderabad";
		
		String[] words=str.split("-",3);
		int count=0;
		
		for(String word:words) {
			System.out.println(word);
			count++;
		}
		
		System.out.println("Total count of words: "+count);

	}

}

package com.stringHandling;

public class TestStrDemo7 {

	public static void main(String[] args) {
		String str="Java is Simple";
		String[] result=str.split(" ");
		int count=0;
		for(String word:result) {
		System.out.println(word);
		count++;
		}
		System.out.println("Number of words in sentence is: "+count);
	}

}

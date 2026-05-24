package com.stringHandling;

import java.util.Scanner;

public class VowelChanger {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string: ");
		String input=sc.nextLine();
		StringBuilder output=new StringBuilder();
		
		for(int i=0;i<input.length();i++) {
			char c=input.charAt(i);
			char ch=Character.toLowerCase(c);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				output.append((char)(ch+1));
			}else {
				output.append(ch);
			}
		}
		System.out.println("output is:"+output.toString());
		sc.close();
	}

}

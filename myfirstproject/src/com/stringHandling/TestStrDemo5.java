package com.stringHandling;

import java.util.Scanner;

public class TestStrDemo5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a name: ");
		String name=sc.next();
		String result="";
		for(int i=0;i<name.length();i++) {
			char c=name.charAt(i);
			if(result.indexOf(c)==-1) {
				result=result+c;
			}
			System.out.println(result);
		}
		System.out.println("*************");
		System.out.println(result);
		sc.close();
	}

}

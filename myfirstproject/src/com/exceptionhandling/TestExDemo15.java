package com.exceptionhandling;

import java.util.Scanner;

public class TestExDemo15 {

	public static void main(String[] args) throws PhaniException {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your age:");
		int age=sc.nextInt();
		
		if(age>=18) {
			System.out.println("you are eligible for driving or voting");
		}else {
			throw new PhaniException("your age is not eligible");
		}
		
	}

}

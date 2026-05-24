package com.operators;

import java.util.Scanner;

public class TestDemo12 {

	public static void main(String[] args) {
		System.out.println("main method started");
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("enter your age: ");
			int age=sc.nextInt();
			String eligibility="";
			System.out.println("enter country name: ");
			String nationality=sc.next();
			
			
			eligibility=(age>=18)&&nationality.equals("india")?"yes":"no";
			
			System.out.println("is the givenn age is eligible: "+eligibility);
		}

	}

}

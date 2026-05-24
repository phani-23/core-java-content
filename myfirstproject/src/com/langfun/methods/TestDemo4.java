package com.langfun.methods;

import java.util.Scanner;

public class TestDemo4 {

	public static void main(String[] args) {
		System.out.println("main method started");
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("enter your age: ");
			int age=sc.nextInt();
			System.out.println("age: "+age);
			
			sc.nextLine();
			System.out.println("enter your name: ");
			String name=sc.nextLine();
			System.out.println("name:"+name);
			System.out.println("enter your branch:");
			String branch=sc.nextLine();
			System.out.println("branch:"+branch);
			System.out.println("main method ended");
			
		}

	}

}

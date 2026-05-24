package com.stringHandling;

import java.util.Scanner;

public class TestStrDemo17 {

	public static void main(String[] args) {
		System.out.println("Welcome to Login Page");
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a username:");
		String uname=sc.next();
		
		System.out.println("Enter your password:");
		String password=sc.next();
		
		if(uname.equalsIgnoreCase("admin")&&password.equals("Admin12345")) {
			System.out.println("Welcome to HomePage "+uname);
		}else {
			System.err.println("Invalid User Credentials!!");
		}
		sc.close();
	}

}

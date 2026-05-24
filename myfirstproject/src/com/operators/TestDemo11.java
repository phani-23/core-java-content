package com.operators;

import java.util.Scanner;

public class TestDemo11 {

	public static void main(String[] args) {
		System.out.println("main method started");
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("enter A value: ");
			int a=sc.nextInt();
			System.out.println("enter B value: ");
			int b=sc.nextInt();
			
			int max=0;
			
			max=a>b ? a:b;
			
			System.out.println("max value is: "+max);
		}

	}

}

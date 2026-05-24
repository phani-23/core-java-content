package com.logicalstatements.whileloop;

import java.util.Scanner;

public class TestDemo6 {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		int rev=0;
		int r=0;
		
		while(n!=0) {
			r=n%10;
			n=n/10;
			rev=rev*10+r;
		}
		
		System.out.println("reverse of a given number: "+rev);
		sc.close();
	}

}

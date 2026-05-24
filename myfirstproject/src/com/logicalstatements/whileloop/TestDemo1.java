package com.logicalstatements.whileloop;

import java.util.Scanner;

public class TestDemo1 {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number: ");
		int n=sc.nextInt();
		int sum=0;
		int r=0;
		while(n>0) {
			r=n%10;
			n=n/10;
			sum=sum+r;
		}
		System.out.println("sum of the number: "+sum);
		sc.close();
	}

}

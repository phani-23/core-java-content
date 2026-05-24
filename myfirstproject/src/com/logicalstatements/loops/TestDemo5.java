package com.logicalstatements.loops;

import java.util.Scanner;

public class TestDemo5 {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number :");
		int num=sc.nextInt();
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
			System.out.println("factors of number is: "+i);
		}
			}
		sc.close();

	}

}

package com.logicalstatements.loops;

import java.util.Scanner;

public class TestDemo6 {
	
	static void findFactors(int num){
		System.out.println("Inside find factors");
		for(int i=1;i<=num/2;i++)
			if(num%i==0) {
				System.out.println("the factors are: "+i);
			}
		System.out.println(num);
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number :");
		int num=sc.nextInt();
		findFactors(num);
		sc.close();
	}

}

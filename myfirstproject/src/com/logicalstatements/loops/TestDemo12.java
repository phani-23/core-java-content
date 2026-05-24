package com.logicalstatements.loops;

import java.util.Scanner;

public class TestDemo12 {
	 static boolean isPrime(int n) {
			boolean status=true;
			if(n==1) {
				return false;
			}else {
				for(int i=2;i<=n/2;i++) {
					if(n%i==0) {
						status=false;
						break;
					}
				}
			}
			return status;
		}

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value: ");
		int i=sc.nextInt();
		boolean status=isPrime(i);
		if(status) {
			System.out.println("the given number is prime");
		}else {
			System.out.println("the given number is not prime");
		}
		sc.close();
	}

}

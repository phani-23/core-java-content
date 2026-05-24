package com.logicalstatements.loops;

import java.util.Scanner;

public class PrimeNumber {
	
	
	public static void main(String[] args) { 
		System.out.println("main method started");
		Scanner sc=new Scanner(System.in);
		System.out.println("printing the prime numbers between 1 to given number: ");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			if(isPrime(i)) {
				System.out.print(i+" ");
			}
		}
		sc.close();
	}
	static boolean isPrime(int n) {
		if(n==1) {
			return false;
		}else {
			for(int i=2;i*i<=n;i++) {
				if(n%i==0) {
					return false;
				}
			}
		}
		return true;
	}
}

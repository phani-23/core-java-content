package com.logicalstatements.whileloop;

import java.util.Scanner;

public class ArmstrongNumber1 {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number: ");
		int n = sc.nextInt();
		String strN=Integer.toString(n);
		int digitCount=strN.length();
		System.out.println(digitCount);
		int temp=n;
		int sumP=0;
		int r=0;
		
		while(n!=0) {
			r=n%10;
			n=n/10;
			sumP=(int) (sumP+Math.pow(r, digitCount));
		}
		if(temp==sumP) {
			System.out.println("it is armstrong");
		}else {
			System.out.println("it is not armstrong");
		}
		sc.close();
	}

}

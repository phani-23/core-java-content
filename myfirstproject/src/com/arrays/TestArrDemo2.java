package com.arrays;

import java.util.Scanner;

public class TestArrDemo2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no of Strings: ");
		int n=sc.nextInt();
		String[] s=new String[n];
		System.out.println("enter "+n+" characaters:");
		for(int i=0;i<n;i++) {
			s[i]=sc.next();
		}
		System.out.println("you entered: ");
		for(String c:s) {
			System.out.print(c+" ");
		}
		sc.close();
	}

}

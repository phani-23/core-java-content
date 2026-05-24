package com.arrays;

import java.util.Scanner;

public class TestArrDemo12 {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of values to be printed in an array: ");
		int[] a=new int[sc.nextInt()];
		System.out.println("enter values to be printed on array: ");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		for(int num:a) {
			System.out.print(num+" ");
		}
		sc.close();
	}

}

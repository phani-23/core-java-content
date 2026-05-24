package com.arrays;

import java.util.Scanner;

public class TestArrDemo1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no of elements: ");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("enter "+n+" integers: ");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("you entered: ");
		for(int num:arr) {
			System.out.print(num+" ");
		}
		sc.close();
	}

}

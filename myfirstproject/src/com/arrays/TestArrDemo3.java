package com.arrays;

import java.util.Scanner;

public class TestArrDemo3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of elements: ");
		int n=sc.nextInt();
		double[] d=new double[n];
		System.out.println("enter "+n+" salaries: ");
		for(int i=0;i<n;i++) {
			d[i]=sc.nextDouble();
		}
		System.out.println("you enetered: ");
		for(double num:d) {
			System.out.print(num+" ");
		}
		sc.close();
	}

}

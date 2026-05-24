package com.logicalstatements.whileloop;

public class TestDemo8 {

	public static void main(String[] args) {
		System.out.println("main method started");
		System.out.println("***********EVEN NUMBERS*************");
		int i=0;
		while(i<=100) {
			if(i%2==0&&i!=0) {
				System.out.print(i+" ");
			}
			i++;
		}
		System.out.println();
		System.out.println("***********ODD NUMBERS***************");
		int j=100;
		while(j>=0) {
			if(j%2==1&&j!=0) {
				System.out.print(j+" ");
			}
			j--;
		}

	}

}

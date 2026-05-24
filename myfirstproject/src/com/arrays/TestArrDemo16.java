package com.arrays;

public class TestArrDemo16 {

	public static void main(String[] args) {
		System.out.println("main method started");
		
		int[][] number={{1,2,3},{4,5,6},{7,8,9}};
		System.out.println(number.length);
		
		for(int i=0;i<number.length;i++) {
			for(int j=0;j<number[i].length;j++) {
				System.out.print(number[i][j]+" ");
			}
			System.out.println();
		}
		
//		for(int[] n:number) {
//			for(int num:n) {
//				System.out.print(num+" ");
//			}
//			System.out.println();
//		}
		System.out.println("main method started");

	}

}

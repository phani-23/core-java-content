package com.arrays;

public class TestArrDemo15 {

	public static void main(String[] args) {
		System.out.println("main method started");
		
		int[][] numbers=new int[3][3];
		
		System.out.println(numbers.length);
		
		numbers[0][0]=10;
		numbers[0][1]=10;
		numbers[0][2]=10;
		
		numbers[1][0]=10;
		numbers[1][1]=10;
		numbers[1][2]=10;
		
		numbers[2][0]=10;
		numbers[2][1]=10;
		numbers[2][2]=10;
		
		for(int i=0;i<numbers.length;i++) {
			for(int j=0;j<numbers[i].length;j++) {
				System.out.print(numbers[i][j]+" ");
			}
			System.out.println();
		}
		
//		for(int[] n1:numbers) {
//			for(int number:n1) {
//				System.out.print(number+" ");
//			}
//			System.out.println();
//		}
		System.out.println("main method ended");

	}

}

package com.arrays;

public class BubbleSort_1 {

	public static void main(String[] args) {
		System.out.println("main method started");
		System.out.println("berfore sorting************");
		int[] arr = { 10, 3, 5, 8, 7, 1 };
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

		System.out.println("after sorting***************");

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j + 1] < arr[j]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
//			for(int n:arr) {
//				System.out.print(n+" ");
//			}
//			System.out.println();
		}
		for (int n : arr) {
			System.out.print(n + " ");
		}
	}

}

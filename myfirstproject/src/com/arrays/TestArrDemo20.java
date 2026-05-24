package com.arrays;

public class TestArrDemo20 {

	public static void main(String[] args) {
		int[] arr = { 1, 3, 4 };
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			if (arr[i] != i + 1) {
				System.out.println(" Missing number: " + (i + 1));
				return;
			}
		}
		System.out.println("The missing number in the array is: " + (n + 1));
	}

}

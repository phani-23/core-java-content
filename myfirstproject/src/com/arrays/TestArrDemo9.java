package com.arrays;

public class TestArrDemo9 {

	public static void main(String[] args) {
		System.out.println("main method started");
		int[] arr = { 12, 305, 44, 9 };
		int[] reversedArr = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {
			int num = arr[i];
			int reversed = 0;
			while (num > 0) {
				int digit = num % 10;
				reversed = reversed * 10 + digit;
				num = num / 10;
			}
			reversedArr[i] = reversed;
		}

		// Print the reversed array
		for (int num : reversedArr) {
			System.out.print(num + " ");
		}

	}
}
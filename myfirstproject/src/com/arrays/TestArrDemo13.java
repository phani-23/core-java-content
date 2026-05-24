package com.arrays;

public class TestArrDemo13 {

	public static void main(String[] args) {
		System.out.println("main method started");
		int[] arr = { 1, 2, 3, 4, 5 };
		int k = 3;
		k = k % arr.length;
		int[] result1 = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			result1[i] = arr[(i + k) % arr.length];
		}

		for (int num : result1) {
			System.out.print(num + " ");
		}

	}

}

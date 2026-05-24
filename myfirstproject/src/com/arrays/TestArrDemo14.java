package com.arrays;

public class TestArrDemo14 {

	public static void main(String[] args) {
		System.out.println("main method started");
		int[] arr = { 1, 2, 3, 4, 5 };
		int k = 2;
		k = k % arr.length;
		int[] result = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			result[i] = arr[(i - k + arr.length) % arr.length];
		}
		for (int num : result) {
			System.out.print(num + " ");
		}
	}

}

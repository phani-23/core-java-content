package com.arrays;

public class TestArrDemo17 {

	public static void main(String[] args) {
		System.out.println("main method started");
		int[] arr = { 5, 0, 1, 0, 3, 5, 0 };
		int index = 0;
		for (int n : arr) {
			if (n != 0) {
				arr[index] = n;
				index++;
			}
		}
		while (index < arr.length) {
			arr[index] = 0;
			index++;
		}
		for (int num : arr) {
			System.out.print(num + " ");
		}
	}

}

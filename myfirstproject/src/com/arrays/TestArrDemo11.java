package com.arrays;

public class TestArrDemo11 {

	public static void main(String[] args) {
		System.out.println("main method started");
		int[] A = { 1, 2, 3, 4, 5, 6 };

		if (A[0] == 1) {
			A[0] = A[0] + A[1];
		}
		System.out.println(A[0]);
		if (A[1] == 2) {
			A[1] = A[0] + A[2];
		}
		System.out.println(A[1]);
		if (A[2] == 3) {
			A[2] = A[1] + A[3];
		}
		System.out.println(A[2]);
		if (A[3] == 4) {
			A[3] = A[2] + A[4];
		}
		System.out.println(A[3]);
		if (A[4] == 5) {
			A[4] = A[3] + A[5];
		}
		System.out.println(A[4]);
		if (A[5] == 6) {
			A[5] = A[4] + A[5];
		}
		System.out.println(A[5]);

	}

}

package com.tandemLoop;

import java.util.*;

public class Problem_4 {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 8, 9, 12, 46, 76, 82, 15, 20, 30 };

		Map<Integer, Integer> result = new LinkedHashMap<>();

		for (int i = 1; i <= 9; i++) {
			int count = 0;
			for (int n : arr) {
				if (n % i == 0) {
					count++;
				}
			}
			result.put(i, count);
		}

		System.out.println(result);

	}

}

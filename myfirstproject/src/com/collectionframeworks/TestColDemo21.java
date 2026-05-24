package com.collectionframeworks;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestColDemo21 {

	public static void main(String[] args) {
		Map<Integer, String> m = new HashMap<>();
		m.put(1, "Mobile");
		m.put(2, "Laptop");
		m.put(3, "Car");
		m.put(4, "Train");
		System.out.println(m);
		System.out.println(m.get(2));
		System.out.println(m.get(3));

		System.out.println("******************************");
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20);

		int n1 = numbers.stream()
				.filter(n -> n % 2 == 0)
				.mapToInt(Integer::intValue)
				.sum();

		System.out.println("Sum of even numbers: " + n1);

	}

}

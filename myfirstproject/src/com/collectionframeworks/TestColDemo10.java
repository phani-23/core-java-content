package com.collectionframeworks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestColDemo10 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50, 20, 50, 60, 80, 10, 100));
		List<Integer> repeat = new ArrayList<>();

		for (int i = 0; i < list.size(); i++) {
			for (int j = i + 1; j < list.size(); j++) {
				if (list.get(i).equals(list.get(j))) {
					if (!repeat.contains(list.get(i))) {
						repeat.add(list.get(i));
					}

				}
			}
		}
		System.out.println(repeat);

	}

}

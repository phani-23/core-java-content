package com.java8features;

import java.util.Arrays;
import java.util.List;

public class TestJ8FDemo3 {

	public static void main(String[] args) {
		List<String> list=Arrays.asList("Phani","Krishna","G");
		list.sort((a,b)->Integer.compare(a.length(), b.length()));
		System.out.println(list);

	}

}

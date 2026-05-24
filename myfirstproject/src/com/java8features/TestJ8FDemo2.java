package com.java8features;

import java.util.Arrays;
import java.util.List;

public class TestJ8FDemo2 {

	public static void main(String[] args) {
		List<String> names=Arrays.asList("Phani","Krishna","Gurijala");
		names.forEach(name->System.out.println(name));

	}

}

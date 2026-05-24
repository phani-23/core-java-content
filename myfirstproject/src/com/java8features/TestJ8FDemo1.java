package com.java8features;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class TestJ8FDemo1 {

	public static void main(String[] args) {
		List<String> names=Arrays.asList("Phani","Krishna","Rama","Hanuman","Luffy","Naruto");
		
		Predicate<String> s1=s -> s.startsWith("R");
		
		names.stream().filter(s1).forEach(System.out::println);
	}

}
package com.java8features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestStream3 {

	public static void main(String[] args) {
		List<String> list=Arrays.asList("Phani","Krishna","sai","vikas","leela swami","deekshith","naveen");
		
		List<String> updatedList=list.stream()
				.filter(s->s.contains("e"))
				.map(s->s+" - Java")
				.map(String::toUpperCase)
//				.map(s->s.toUpperCase())
				.sorted()
				.collect(Collectors.toList());
		
		updatedList.forEach(System.out::println);

	}

}

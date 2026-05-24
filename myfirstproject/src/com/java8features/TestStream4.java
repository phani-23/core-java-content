package com.java8features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestStream4 {

	public static void main(String[] args) {
		List<Double> sal=Arrays.asList(10000.0,500000.0,250000.00,10000.00,580000.0,650000.0,750000.0,550000.0);
		
		List<Double> updatedsal=sal.stream().map(s->s+5000.0).sorted().distinct().collect(Collectors.toList());
		
		updatedsal.forEach(System.out::println);

	}

}

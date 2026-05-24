package com.java8features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class TestStream2 {

	public static void main(String[] args) {
		
		List<Integer> l=Arrays.asList(10,20,25,3,5,10,90,6,90,56,75);
		
		List<Integer> l1=l.stream().filter(i->i>=25).sorted().distinct().collect(Collectors.toList());
//		System.out.println(l1);
		l1.forEach(System.out::println);

	}

}

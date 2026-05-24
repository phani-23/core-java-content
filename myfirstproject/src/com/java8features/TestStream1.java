package com.java8features;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestStream1 {

	public static void main(String[] args) {
		List<Integer> l1=new ArrayList<>();
		l1.add(10);
		l1.add(15);
		l1.add(17);
		l1.add(11);
		l1.add(62);
		l1.add(87);
		l1.add(8);
		l1.add(35);
		l1.add(77);
		l1.add(43);
		
		Stream<Integer> s1=l1.stream();
		List<Integer> l2=s1.filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(l2);
		
		
	}

}

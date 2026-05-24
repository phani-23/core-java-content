package com.collectionframeworks;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TestColDemo19 {

	public static void main(String[] args) {
		
		
		Set<Integer> s1=new HashSet<>();
		s1.add(12);
		s1.add(150);
		s1.add(22);
		s1.add(58);
		s1.add(23);
		
		System.out.println(s1);
		
		System.out.println("**********************");
		
		Set<String> s=new HashSet<>();
		
		s.add("phani");
		s.add("krishna");
		s.add("krish");
		s.add("phani");
		s.add("pk");
		s.add("gpk");
		s.add("Gphani");
		
		System.out.println(s);
		
		System.out.println("******************");
		
		HashSet<Integer> set = new HashSet<>();
		set.add(30);
		set.add(10);
		set.add(20);
		System.out.println(set);

		System.out.println("******************");

		
		LinkedHashSet<Integer> set1 = new LinkedHashSet<>();
		set1.add(30);
		set1.add(10);
		set1.add(20);
		System.out.println(set1);
		
		System.out.println("******************");

		
		TreeSet<Integer> set2 = new TreeSet<>();
		set2.add(30);
		set2.add(10);
		set2.add(20);
		System.out.println(set2);

		
		
		


	}

}

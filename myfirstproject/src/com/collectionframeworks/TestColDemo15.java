package com.collectionframeworks;

//import java.util.HashSet;
//import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class TestColDemo15 {

	public static void main(String[] args) {
		
//		Set<Integer> s=new HashSet<>();
		SortedSet<Integer> s=new TreeSet<>();
		s.add(100);
		s.add(300);
		s.add(200);
		s.add(500);
		s.add(400);
		s.add(50);
		
		System.out.println(s);

	}

}

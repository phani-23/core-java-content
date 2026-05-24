package com.collectionframeworks;

import java.util.ArrayList;
import java.util.List;

public class TestColDemo8 {

	public static void main(String[] args) {
		
		List<Integer> l1=new ArrayList<>();
		l1.add(10);
		l1.add(18);
		l1.add(7);
		l1.add(1, 5);
		l1.add(2, 15);
		System.out.println(l1.get(4));
		l1.add(4);
		l1.add(null);
		l1.add(null);
		l1.add(8);
		
		System.out.println(l1);

	}

}

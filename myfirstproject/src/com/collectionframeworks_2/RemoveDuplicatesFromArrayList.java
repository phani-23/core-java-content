package com.collectionframeworks_2;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class RemoveDuplicatesFromArrayList {

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(20);
		list.add(10);
		
		System.out.println(list);
		
		LinkedHashSet<Integer> set=new LinkedHashSet<Integer>(list);
		
		ArrayList<Integer> result=new ArrayList<>(set);
		
		System.out.println(result);
	}

}

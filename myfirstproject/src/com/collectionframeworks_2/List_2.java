package com.collectionframeworks_2;

import java.util.LinkedList;
import java.util.List;

public class List_2 {

	public static void main(String[] args) {
		List<Integer> list=new LinkedList<>();
		
		list.add(100);
		list.add(150);
		list.add(200);
		System.out.println(list);
		list.add(0, 0);
		System.out.println(list);
		list.set(0, 1);
		System.out.println(list);
		System.out.println(list.get(0));
		for(int i:list) {  
			System.out.println(i);
		}
	}

}

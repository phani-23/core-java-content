package com.collectionframeworks_2;

import java.util.LinkedList;
import java.util.List;

public class LinkedList_1 {

	public static void main(String[] args) {
		List<Integer> l=new LinkedList<>();
		l.add(100);
		l.add(200);
		l.add(300);
		
		System.out.println(l);
		
		l.addFirst(10);
		l.add(400);
		l.addLast(20);
		System.out.println(l);
		
		l.removeFirst();
		l.removeLast();
		System.out.println(l);
		l.remove(0);
		System.out.println(l);
		
	}

}

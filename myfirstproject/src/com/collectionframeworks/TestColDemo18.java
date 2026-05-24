package com.collectionframeworks;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class TestColDemo18 {

	public static void main(String[] args) {
		System.out.println("main method started");
		List<Integer> l1=new CopyOnWriteArrayList<>();
		l1.add(101);
		l1.add(102);
		l1.add(103);
		l1.add(105);
		l1.add(106);
		
		
		Iterator<Integer> i=l1.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
			l1.add(107);
		}
		System.out.println(l1);
	}

}

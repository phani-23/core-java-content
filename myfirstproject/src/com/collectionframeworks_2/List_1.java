package com.collectionframeworks_2;

import java.util.ArrayList;
import java.util.List;

public class List_1 {

	public static void main(String[] args) {
		
		List<String> l1=new ArrayList<>();
		l1.add("phani");
		l1.add(null);
		l1.add("100");
		l1.add("");
		l1.add("g");
		l1.add("phani");
		l1.add("g");
		l1.add(1, "deek");
		
		System.out.println("the printed strings are:");
		
		for(String l:l1) {
			System.out.println(l);
		}

		l1.set(2, "Krishna");
		System.out.println(l1);
		
		int l2=l1.indexOf("g");
		System.out.println(l2);
		
		int l3=l1.lastIndexOf("g");
		System.out.println(l3);
		
		l1.remove(4);
		System.out.println(l1);
		
		String l5=l1.get(4);
		System.out.println(l5);
		
		boolean b=l1.contains("Krishna");
		System.out.println(b);
		
		
		List<Integer> m=new ArrayList<>();
		m.add(1);
		m.add(3);
		m.add(5);
		m.add(2);
		m.add(4);
		
		System.out.println(m);
		
		
		
	}

}

package com.collectionframeworks_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class List_3 {

	public static void main(String[] args) {
		List<Integer> l=new ArrayList<>();
		l.add(10);
		l.add(9);
		l.add(23);
		l.add(22);
		l.add(70);
		l.add(555);
		l.add(100);
		l.add(33);
		l.add(3);
		
		System.out.println(l);
		
		int i=Collections.max(l);
		
		int i1=Collections.min(l);
		
		System.out.println("max:"+i+" "+"min:"+i1);
		
		List<String> s=new ArrayList<>();
		s.add("Krishna");
		s.add("Phani");
		s.add("Gurijala");
		
		Collections.reverse(s);
		
		System.out.println(s);

	}

}

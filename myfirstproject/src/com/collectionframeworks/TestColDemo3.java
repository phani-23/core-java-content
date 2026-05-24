package com.collectionframeworks;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;
import java.util.Vector;

public class TestColDemo3 {

	public static void main(String[] args) {
		Collection<String> c2=new ArrayList<>();
		Queue<Integer> c3=new LinkedList<>();
		List<Object> l1=new ArrayList<>();
		List<Double> d1=new Stack<>();
		List<Float> f1=new Vector<>();
		
		
		c2.add("Phani");
		c2.add("Krishna");
		c3.add(100);
		c3.add(200);
		c3.add(300);
		l1.add(null);
		l1.add(c3);
		l1.add(c2);
		l1.add(100);
		d1.add(100.0);
		d1.add(25.5);
		d1.add(525.5);
		f1.add(25.5f);
		f1.add(125.25f);
		f1.add(2 , 23.5f);
		l1.add(f1);	
		
		
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(l1);
		System.out.println(d1);
		System.out.println(f1);
		
		for(int i:c3) {
			System.out.println(i);
		}

	}

}

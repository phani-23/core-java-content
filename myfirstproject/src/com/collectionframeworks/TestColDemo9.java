package com.collectionframeworks;

import java.util.ArrayList;
import java.util.List;

public class TestColDemo9 {

	public static void main(String[] args) {
		
		List<Integer> l1=new ArrayList<>();
		l1.add(10);
		l1.add(18);
		l1.add(7);
		l1.add(0, 50);
		l1.add(1, 10);
		l1.add(2, 25);
		l1.add(6,35);
		l1.add(90);
		
		
		l1.remove(l1.indexOf(7));
		System.out.println(l1);

	}

}

package com.collectionframeworks;

//import java.util.ArrayList;
import java.util.Collection;
import java.util.Vector;

public class TestColDemo2 {

	public static void main(String[] args) {
		Collection<Integer> c1=new Vector<>();
		c1.add(100);
		c1.add(50);
		c1.add(25);
		c1.add(0);
//		c1.add();
		c1.add(null);
		
		
		System.out.println(c1);

	}

}

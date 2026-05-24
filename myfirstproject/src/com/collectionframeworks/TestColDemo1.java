package com.collectionframeworks;

import java.util.ArrayList;
import java.util.Collection;

public class TestColDemo1 {

	public static void main(String[] args) {
		Collection<Object> c=new ArrayList<>();
		
		c.add("Phani");
		c.add("Krishna");
		c.add(101);
		c.add(102);
		c.add(103);
		c.add(104);
		
		System.out.println(c);

	}

}

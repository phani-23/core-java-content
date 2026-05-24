package com.collectionframeworks;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestColDemo13 {

	public static void main(String[] args) {
		
		TestColDemo12 t1=new TestColDemo12(1, "Phani", 95555000044L, 100.0);
		TestColDemo12 t2=new TestColDemo12(2, "Krishna", 5000448866L, 95.0);
		TestColDemo12 t3=new TestColDemo12(3, "Dekshith", 528765466L, 10.0);
		TestColDemo12 t4=new TestColDemo12(4, "Sai", 989785754L, 50.0);
		TestColDemo12 t5=new TestColDemo12(5,"vikas", 857549524L, 35.0);
		
		List<TestColDemo12> std=new ArrayList<>();
		std.add(t1);
		std.add(t2);
		std.add(t3);
		std.add(t4);
		std.add(t5);
		
		
		Iterator<TestColDemo12> i=std.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println(std);
	}

}

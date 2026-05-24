package com.collectionframeworks;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class TestColDemo6 {

	public static void main(String[] args) {
		
		Collection<String> cricketers=new ArrayList<>();
		
		cricketers.add("MSD");
		cricketers.add("Virat");
		cricketers.add("Rohit");
		cricketers.add("Abhishek");
		cricketers.add("Pat Cummins");
		cricketers.add("Travis Head");
		cricketers.add("Klassen");
		
		cricketers.remove("Virat");
		System.out.println(cricketers);
		
		Iterator<String> itr=cricketers.iterator();
		
		while(itr.hasNext()) {
//			System.out.println(itr.next());
			if(itr.next().equals("Abhishek")) {
				itr.remove();
			}
		}
		System.out.println(cricketers);
		
		System.out.println("********************");
		for(String cricketer:cricketers) {
			System.out.println(cricketer);
		}
		
		System.out.println(cricketers);
	}

}

package com.collectionframeworks_2;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedList_2 {

	public static void main(String[] args) {
		List<String> l=new LinkedList<>();
		l.add("SRH");
		l.add("MI");
		l.add("RR");
		l.add("DC");
		
		Iterator<String> i=l.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println("********************");
		Collections.reverse(l);
		
		for(String teams:l) {
			System.out.println(teams);
		}
		

	}

}

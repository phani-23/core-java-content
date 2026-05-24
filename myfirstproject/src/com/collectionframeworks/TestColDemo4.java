package com.collectionframeworks;

import java.util.ArrayList;
import java.util.Collection;

public class TestColDemo4 {

	public static void main(String[] args) {
		
		Collection<String> boys=new ArrayList<>();
		boys.add("Rama");
		boys.add("Lakshamana");
		boys.add("Krishna");
		boys.add("Vishnu");
		boys.add("shiva");
//		boys.clear();
		System.out.println(boys);
		System.out.println(boys.contains("Rama"));
		
		Collection<String> girls=new ArrayList<>();
		girls.add("Seetha");
		girls.add("Saraswathi");
		girls.add("Parvathi");
		girls.add("Lakshmi");
		girls.add("Radha");
//		System.out.println(girls);
		
		Collection<String> students=new ArrayList<>();
		students.addAll(boys);
		students.addAll(girls);
		
		System.out.println(students);
//		boys.clear();
		boys.add("Phani");
		System.out.println(students.containsAll(boys));
		
		for(String student:students) {
			System.out.println(student);
		}
		
		System.out.println("***************");
		System.out.println(students);
		students.removeAll(boys);
		System.out.println(students);
		
		System.out.println(students.size());
		String st=new String("Phani");
		System.out.println(st.length());
		Object[] arr=students.toArray();
		System.out.println(arr.length);
		for(Object o:arr) {
			System.out.println(o);
		}

	}

}

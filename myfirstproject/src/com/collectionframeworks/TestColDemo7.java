package com.collectionframeworks;

import java.util.ArrayList;
import java.util.Collection;

public class TestColDemo7 {

	public static void main(String[] args) {
		System.out.println("main method started");
		
		Collection<String> fruits=new ArrayList<>();
		fruits.add("Mango");
		fruits.add("Banana");
		fruits.add("Orange");
		fruits.add("Pineapple");
		fruits.add("Apple");
		fruits.remove("Mango");
		
		System.out.println(fruits);
		
		
		Collection<String> veggies=new ArrayList<>();
		veggies.add("Tomato");
		veggies.add("Potato");
		veggies.add("Banana");
		veggies.add("Bendi");
		veggies.add("Brinjal");
		
		fruits.retainAll(veggies);
		
		System.out.println(fruits);
		System.out.println(veggies);
	}

}

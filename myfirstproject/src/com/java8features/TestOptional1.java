package com.java8features;

import java.util.Optional;

public class TestOptional1 {

	public static void main(String[] args) {
		
		Optional<String> o1=Optional.ofNullable("Phani");
		
		Optional<String> o2=Optional.ofNullable(null);
		
		
		System.out.println(o1);
		System.out.println(o2);
		
		System.out.println(o1.isEmpty());
		System.out.println(o1.isPresent());
		System.out.println(o2.isEmpty());
		System.out.println(o2.isPresent());
		
		System.out.println("***********************");
		
		String[] list= {"Phani","Krishna","Gurijala",null,null,"PK","RamCharan",null};
		
		for(String l:list) {
			Optional<String> o=Optional.ofNullable(l);
			if(o.isPresent()) {
			System.out.println(l.toUpperCase());
			}
			
		}

	}

}

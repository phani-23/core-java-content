package com.collectionframeworks;

//Occurrences if Each words 

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class TestColDemo16 {

	public static void main(String[] args) {
		System.out.println("main method started!!!");
		
		System.out.println("Enter a String: ");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		Map<String,Integer> map=new HashMap<>();
		
		String[] c=str.split(" ");
		
		for(String s: c) {
			if(map.containsKey(s)) {
				map.put(s, map.get(s)+1);
				
			}
			else {
				map.put(s, 1);
			}
		}
		
		System.out.print(map);
		
		sc.close();
	}

}

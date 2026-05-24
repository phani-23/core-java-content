package com.collectionframeworks;

//Occurrences of each word...

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TestColDemo17 {

	public static void main(String[] args) {
		System.out.println("main emthod started");
		
		System.out.println("Enter a String: ");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		
		Map<Character,Integer> map=new HashMap<>();
		
		char[] c=str.toCharArray();
		
		for(char ch:c) {
			if(map.containsKey(ch)) {
				map.put(ch, map.get(ch)+1);
				
			}
			else {
				map.put(ch, 1);
			}
		}
		
		System.out.print(map);
		
		sc.close();
	}

}

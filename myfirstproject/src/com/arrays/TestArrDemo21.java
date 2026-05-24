package com.arrays;

import java.util.Scanner;

public class TestArrDemo21 {
	
	public static void main(String[] args) {
		 System.out.println("Enter a sentence:");
		 Scanner sc=new Scanner(System.in);
	        String sentence = sc.nextLine();
	        
	        // Convert to lowercase for uniformity
	        sentence = sentence.toLowerCase();
	        
	        // Boolean array to track presence of each alphabet
	        boolean[] alphabets = new boolean[26];
	        
	        // Mark letters present in the sentence
	        for (int i = 0; i < sentence.length(); i++) {
	            char ch = sentence.charAt(i);
	            if (ch >= 'a' && ch <= 'z') {
	                alphabets[ch - 'a'] = true;
	            }
	        }
	        
	        // Check if all alphabets exist
	        boolean allExists = true;
	        for (boolean present : alphabets) {
	            if (!present) {
	                allExists = false;
	                break;
	            }
	        }
	        
	        // Print result
	        if (allExists) {
	            System.out.println("All alphabets exist");
	        } else {
	            System.out.println("Not exists");
	        }
	        
	        sc.close();

	}

}

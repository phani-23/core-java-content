package com.arrays;

public class TestArrDemo22 {

	public static void main(String[] args) {
		String[] arr = { "Tommy", "James", "Praveen", "Ramesh", "Harry Potter","karthik","deekshith" };
		for (int i = 0; i < arr.length; i++) {
			String str = arr[i].toLowerCase();
			String unique = "";
			for (int j = 0; j < str.length(); j++) {
				char ch = str.charAt(j);
				if (unique.indexOf(ch) == -1) {
					unique = unique + ch;
				}
			}
			System.out.println(str + "-" + unique + "-count:" + unique.length());
		}

	}

}

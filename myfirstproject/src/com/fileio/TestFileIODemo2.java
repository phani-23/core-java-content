package com.fileio;

import java.io.File;

public class TestFileIODemo2 {

	public static void main(String[] args) {
		System.out.println("main method started");
		
		File f=new File("C:\\Users\\DELL\\Practice_programs");
		String[] names=f.list();
		int count=0;
		for(String name:names) {
			System.out.println(name);
			count++;
		}
		System.out.println("Count of all files are : "+count);
	}

}

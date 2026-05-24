package com.exceptionhandling;

import java.io.File;
import java.io.IOException;

public class TestExDemo11 {

	public static void main(String[] args) {
		System.out.println("main method started");
		
		File f=new File("C:\\Users\\DELL\\Practice_programs\\phani.txt");
		try {
			System.out.println("in try");
			f.createNewFile();
			System.out.println("File created successfully");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("main method started");
	}

}

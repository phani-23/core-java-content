package com.exceptionhandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestExDemo12 {

	public static void main(String[] args) {
		System.out.println("main method started");
		
		try {
			FileReader fr=new FileReader("C:\\Users\\DELL\\Practice_programs\\phani.txt");
			try {
				int n=fr.read();
				
				while(n!=-1) {
					try {
						Thread.sleep(200);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.print((char)n);
					n=fr.read();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		System.out.println();
		
		System.out.println("main method ended");
	}

}

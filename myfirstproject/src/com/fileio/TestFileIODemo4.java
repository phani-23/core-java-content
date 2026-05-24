package com.fileio;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TestFileIODemo4 {

	public static void main(String[] args) throws IOException {
		System.out.println("main method started");
		
		FileWriter fw=new FileWriter("C:\\Users\\DELL\\Practice_programs\\pk.txt");
		try (BufferedWriter bw = new BufferedWriter(fw)) {
			bw.write("helloo good evening");
			bw.newLine();
			bw.write(65);
			bw.newLine();
			bw.write('A');
			
			bw.flush();
		}

	}

}

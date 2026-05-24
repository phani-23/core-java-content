package com.fileio;

import java.io.FileReader;
import java.io.IOException;

public class TestFileIODemo5 {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.out.println("main method started!!");
		try (FileReader fr = new FileReader("C:\\Users\\DELL\\Practice_programs\\phani.txt")) {
			int i=fr.read();
			while(i!=-1) {
				Thread.sleep(100);
				System.out.print((char)i);
				i=fr.read();
			}
		}

	}

}

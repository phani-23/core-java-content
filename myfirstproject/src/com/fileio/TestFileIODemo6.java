package com.fileio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TestFileIODemo6 {

	public static void main(String[] args) throws IOException, InterruptedException {
		File f=new File("C:\\Users\\DELL\\Practice_programs\\pk.txt");
		FileReader fr=new FileReader(f);
		try (BufferedReader br = new BufferedReader(fr)) {
			String s=br.readLine();
			
			while(s!=null) {
				Thread.sleep(1000);
				System.out.println(s);
				s=br.readLine();
			}
		}

	}

}

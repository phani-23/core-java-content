package com.fileio;

import java.io.File;
import java.io.IOException;

public class TestFileIODemo3 {

	public static void main(String[] args) throws IOException {
		System.out.println("main method started");
		
		File f=new File("C:\\Users\\DELL\\Practice_programs\\krishna");
		f.mkdir();
		File f1=new File(f, "Test.txt");
		f1.createNewFile();

	}

}

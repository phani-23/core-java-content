package com.fileio;

import java.io.File;
import java.io.IOException;

public class TestFileIODemo1 {

	public static void main(String[] args) throws IOException {
		System.out.println("main method started");
		File f = new File("C:\\Users\\DELL\\Practice_programs\\pk.txt");

		if (!f.exists()) {
			boolean status = f.createNewFile();
			if (status) {
				System.out.println("File has been Created successfully");
			} else {
				System.out.println("something went wrong!!!");
			}
		}else {
			System.out.println("with this name file has there create with another name!!!");
		}
		System.out.println(f.canExecute());
		System.out.println(f.canRead());
		System.out.println(f.canWrite());
		
		System.out.println(f.getAbsolutePath());
		System.out.println(f.getCanonicalPath());
		System.out.println(f.getAbsoluteFile());
		System.out.println("************************");
		System.out.println(f.getFreeSpace());
		System.out.println(f.getUsableSpace());
		System.out.println(f.getTotalSpace());
		System.out.println("************************");
		File f1 = new File("C:\\Users\\DELL\\Practice_programs");
		System.out.println(f1.isDirectory());
		System.out.println(f1.isFile());

//		System.out.println(f.delete());
		System.out.println("main method ended");
	}

}

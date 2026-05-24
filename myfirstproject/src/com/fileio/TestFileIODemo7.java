package com.fileio;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class TestFileIODemo7 {

	public static void main(String[] args) throws FileNotFoundException {
		System.out.println("main method started");
		PrintWriter pw=new PrintWriter("C:\\Users\\DELL\\Practice_programs\\krishna\\hello.txt");
		pw.println("Hello Guys , Iam Phani Krishna");
		pw.println(false);
		pw.println('A');
		pw.println(100);
		pw.println();
		pw.println(45.5F);
		pw.flush();
		pw.close();
		System.out.println("main method ended");
	}

}

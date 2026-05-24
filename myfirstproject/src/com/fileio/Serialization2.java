package com.fileio;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Serialization2 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		FileInputStream fis=new FileInputStream("C:\\Users\\DELL\\Practice_programs\\emp1.ser");
		try (ObjectInputStream ois = new ObjectInputStream(fis)) {
			Employee emp=(Employee)ois.readObject();
			
			System.out.println(emp.username);
			System.out.println(emp.password);
		}

	}

}

package com.fileio;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Serializable{

	private static final long serialVersionUID = 1L;
	String username="Phani";
	transient String password="Phani1234";
}

public class Serialization1 {

	public static void main(String[] args) throws IOException {
		System.out.println("main method started");
		
		Employee emp1=new Employee();
		
		FileOutputStream fos=new FileOutputStream("C:\\Users\\DELL\\Practice_programs\\emp1.ser");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(emp1);
		oos.close();

	}

}

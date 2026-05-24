package com.collectionframeworks;
//Comparator
public class Student {
	int id;
	String name;
	int marks;
	long phone;
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + ", phone=" + phone + "]";
	}
	public Student(int id, String name, int marks, long phone) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
		this.phone = phone;
	}
	
	
}

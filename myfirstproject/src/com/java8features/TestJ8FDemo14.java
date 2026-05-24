package com.java8features;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class Student{
	int sid;
	double marks;
	String name;
	public Student(int sid, double marks, String name) {
		super();
		this.sid = sid;
		this.marks = marks;
		this.name = name;
	}
	
}

public class TestJ8FDemo14 {

	public static void main(String[] args) {
		
		Predicate<Student> p1=(st)->st.marks>=20;
		Predicate<Student> p2=(st)->st.name.contains("i");
		Predicate<Student> p3=p1.and(p2);
		
		Function<Student, String> f1=(st)->{
			String grade="";
			
			if(st.marks>=90) {
				grade="A";
			}else if(st.marks>=80){
				grade="B";
			}else if(st.marks>=70){
				grade="C";
			}else if(st.marks>=60){
				grade="D";
			}else if(st.marks>=35){
				grade="Just Passed";
			}else {
				grade="F";
			}
			return grade;
		};
		
		Consumer<Student> c1=(s)->{
			System.out.println("Id: "+s.sid);
			System.out.println("Name: "+s.name);
			System.out.println("Marks: "+s.marks);
			System.out.println("Grade: "+f1.apply(s));
			System.out.println("****************");
		};
		
		Student s1=new Student(7,100,"Dhoni");
		Student s2=new Student(18,89.9,"Kholi");
		Student s3=new Student(45,58.5,"Rohith");
		Student s4=new Student(4,77.5,"Abhishek");
		Student s5=new Student(11,76.5,"Ishan");
		Student s6=new Student(8,25.5,"Jadeja");
		
		Student[] list= {s1,s2,s3,s4,s5,s6};
		for(Student s:list) {
			if(p3.test(s)) {
				c1.accept(s);
			}
		}

	}

}

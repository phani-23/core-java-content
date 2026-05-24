package com.collectionframeworks;
//Comparator
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestStudent {

	public static void main(String[] args) {
		
		Student s1=new Student(1,"Phani",100,9550638095L);
		Student s2=new Student(6,"Krishna",90,9550638095L);
		Student s3=new Student(3,"sai",10,9550638095L);
		Student s4=new Student(5,"vikas",70,9550638095L);
		Student s5=new Student(4,"deekshith",80,9550638095L);
		Student s6=new Student(7,"naveen",60,9550638095L);
		
		List<Student> l1=new ArrayList<>();
		l1.add(s1);
		l1.add(s2);
		l1.add(s3);
		l1.add(s4);
		l1.add(s5);
		l1.add(s6);
		
		Comparator<Student> c=new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				if(o1.id<o2.id) {
					return -1;
				}else if(o1.id>o2.id) {
					return 1;
				}else {
					return 0;
				}
				
			}
			
		};

		Collections.sort(l1, c);
		
		
		for(Student s:l1) {
			System.out.println(s);
		}
	}

}

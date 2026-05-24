package com.collectionframeworks;
//Comparable
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestEmployee {

	public static void main(String[] args) {
		
		Employee e1=new Employee(1,"phani",25000.00,9550638095L);
		Employee e2=new Employee(4,"hani",45000.00,9550638095L);
		Employee e3=new Employee(6,"ani",25500.00,9550638095L);
		Employee e4=new Employee(3,"ni",25050.00,9550638095L);
		Employee e5=new Employee(2,"nipha",55000.00,9550638095L);
		Employee e6=new Employee(5,"pha",25800.00,9550638095L);
		
		List<Employee> l=new ArrayList<>();
		l.add(e1);
		l.add(e2);
		l.add(e3);
		l.add(e4);
		l.add(e5);
		l.add(e6);
		
		
		Collections.sort(l);
		

		
		for(Employee e:l) {
			System.out.println(e);
		}
		
		System.out.println(l);

	}

}

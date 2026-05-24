package com.java8features;

import java.util.Date;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class TestJ8FDemo13 {

	public static void main(String[] args) {
		System.out.println("Main method started");
		System.out.println("*******************");
		Supplier<Date> s2=()->new Date();
		System.out.println(s2.get());
		System.out.println("*******************");
		Supplier<String> s3=()->{
			return "Java 8 is more Simple..";
		};
		System.out.println(s3.get());
		System.out.println("********************");
		Consumer<String> c2=(s)-> System.out.println(s.toUpperCase());
		c2.accept("Good Morning");
		System.out.println("********************");
		Consumer<Integer> c1=(i)-> System.out.println(i*i*i);
		c1.accept(10);
		System.out.println("********************");
		Function<String, Integer> f2=(s)->s.length();
		System.out.println(f2.apply("Java is Simple"));
		System.out.println("********************");
		Function<String, String> f3=(s)->s.toUpperCase();
		System.out.println(f3.apply("Java is Simple"));
		System.out.println("*********************");
		Function<Integer, Integer> f1=(i)->i*i;
		System.out.println(f1.apply(10));
		System.out.println(f1.apply(15));
		System.out.println("*****************");
		Predicate<Integer> p1=(i)->i%2==0;
		System.out.println(p1.test(100));
		System.out.println(p1.test(9));
		System.out.println(p1.test(25));
		System.out.println("**********************");
		Predicate<String> s1=(s)->s.contains("h");
		System.out.println(s1.test("Phani"));
		System.out.println(s1.test("Abhi"));
		System.out.println(s1.test("Rohith"));
	}

}

package com.java8features;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class TestDate2 {

	public static void main(String[] args) {
		LocalDateTime lt1=LocalDateTime.of(2003, 8,29,8,30);
		System.out.println("Birth Date: "+lt1);
		System.out.println("Birthday Date after 6 months: "+lt1.plusMonths(6));
		System.out.println("Birthday Date before 6 months: "+lt1.minusMonths(6));
		
		
		LocalDateTime lt=LocalDateTime.now();
		System.out.println(lt);
		int m1=lt.getMonthValue();
		int d1=lt.getDayOfMonth();
		int yy=lt.getYear();
		
		int hr=lt.getHour();
		int min=lt.getMinute();
		int ss=lt.getSecond();
		
		System.out.printf("%d-%d-%d-%d:%d:%d",d1,m1,yy,hr,min,ss);
		System.out.println();
		
		System.out.println("******************");
		
		LocalDate ld=LocalDate.now();
		System.out.println(ld);
		int m=ld.getMonthValue();
		int d=ld.getDayOfMonth();
		int y=ld.getYear();
		System.out.printf("%d-%d-%d",m,d,y);
		
		
		
		LocalTime lt2=LocalTime.now();
		System.out.println("\nCurrentTime: "+lt2);
		int minutes=lt2.getMinute();
		int hour=lt2.getHour();
		int seconds=lt2.getSecond();
		System.out.printf("%d:%d:%d",hour,minutes,seconds);
	}

}

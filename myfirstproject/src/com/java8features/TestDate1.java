package com.java8features;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDate1 {
	
	static final String old_Format="dd-mm-yyyy";
	static final String new_Format="yyyy-mm-dd";
	
	public static void main(String[] args) throws ParseException {
		long millis=System.currentTimeMillis();
		Date date=new Date(millis);
		System.out.println(date);
		
		String s="123";
		int s1=Integer.parseInt(s);
		System.out.println(s+10);
		System.out.println(s1+10);
		
		String oldDate="29-08-2003";
		String newDate;

		
		SimpleDateFormat sdf=new SimpleDateFormat(old_Format);
		Date d=sdf.parse(oldDate);
		System.out.println(d);
		
		sdf.applyPattern(new_Format);
		newDate=sdf.format(d);
		
		System.out.println("Old Date: "+oldDate);
		System.out.println("New Date: "+newDate);
				
		
		
	}

}

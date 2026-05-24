package com.stringHandling;

public class TestStrDemo32 {

	public static void main(String[] args) {
		
		String s="     Good Morning Have a Nice Day    ";
		System.out.println(s);
		System.out.println(s.trim());
		
		String s1="     Phani Krishna is a Full Stack Developer     ";
		System.out.println(s1.replace('i', 'e'));
		System.out.println(s1.replace("Fu", "Fuuuuu"));
		System.out.println(s1.replaceAll("Fu", "Nullll"));
		
		String s2="Mock interviews are the 173 Game Changers at 507002";
		System.out.println(s2.replaceAll("\\d","a"));
		
		String s3="Weekly Tests are mandatory";
		System.out.println(s3.replaceAll("\\s", ""));
		
		String s4="Good Morning Good Day Good Batch";
		System.out.println(s4.replaceFirst("Good", "Super"));
		System.out.println(s4.replaceFirst("",s4.replace("Good", "Super")));
	}

}

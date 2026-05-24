package com.languagefundamentals;

public class student {
//TestTypesofVariablesDemo1
	//instance + primitive data
	int a=10;
	//instance + object data
	String name="Ram";
	
	//static +object data
	static String orgName="Vcube Software Solutions";
	//static + primitive data
	static int orgId=123;
	

	public static void main(String[] args) {
		System.out.println("main method started");
		
		int orgId=555;
		String orgName="vcube";
		
		student s=new student();
		System.out.println(s.a);
		System.out.println(s.name);
		
		System.out.println("static data we can access directly***************");
		System.out.println(orgId);
		System.out.println(orgName);
		
		System.out.println("static data we can access with class name********");
		System.out.println(student.orgId);
		System.out.println(student.orgName);
		
	}

}

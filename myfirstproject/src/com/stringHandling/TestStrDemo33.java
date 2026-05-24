package com.stringHandling;

import java.util.Scanner;
import java.util.regex.Pattern;

public class TestStrDemo33 {
	
	static Scanner sc=new Scanner(System.in);

	 void main(String[] args) {
		 
		 if(isAadharValidated()&& isPanValidated()&&isPhoneNumberValid()) {
			 System.out.println("You are Authenticated Successfully!!");
		 }else {
			 System.out.println("Something went wrong with your KYC!!");
		 }
		

	}

	    boolean isPhoneNumberValid() {
	    	
	    	System.out.println("Enter your phone Number: ");
	    	String phone=sc.next();
	    	return Pattern.matches("^[6-9]{1}[0-9]{9}$",phone);
	}

	   boolean isPanValidated() {
		   
		   System.out.println("Enter your Aadhar: ");
		   String aadhar=sc.next();
		   return Pattern.matches("^[0-9]{12}$", aadhar);
	}

	  boolean isAadharValidated() {
		  
		  System.out.println("Enter your Pan: ");
		   String pan=sc.next();
		   return Pattern.matches("^[A-Z]{5}[0-9]{4}[A-Z]{1}$", pan);
		  
		
	 }

}

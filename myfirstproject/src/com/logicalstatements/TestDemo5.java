package com.logicalstatements;

import java.util.Scanner;

public class TestDemo5 {

	public static void main(String[] args) {
		System.out.println("welcome to matrimonal console based app");
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("can you please tell your name: ");
			String name=sc.nextLine();
			
			System.out.println("can you please enter your assets and salary info");
			double assetsInfo=sc.nextDouble();
			System.out.println("enter salary:");
			double salary=sc.nextDouble();
			
			if(assetsInfo>=50000000.00 || salary>=2500000.00) {
				System.out.println("okay we can proceed further!Mr: "+name);
				
				System.out.println("enter your age: ");
				int age=sc.nextInt();
				if(age>26&&age<=28) {
					System.out.println("okay then enter your weight and height");
					System.out.println("enter your weight: ");
					double weight=sc.nextDouble();
					System.out.println("enter your height: ");
					double height=sc.nextDouble();
					
					if((weight>65 && weight<=70)&&(height>=5.3&&height<=6.2)) {
						System.out.println("okay we proceed further we need more info!");
						
						System.out.println("do you have siblings..? if yes enter true or false");
						boolean sibStatus=sc.nextBoolean();
						if(!sibStatus) {
							System.out.println("you almost match our requirements!!");
						}else {
							System.out.println("sorry we cannot proceed!");
						}
					}else {
						System.out.println("sorry your weight or height is not matching");
					}
					
				}else {
					System.out.println("sorry your age is not matching");
				}
				
			}else {
				System.out.println("sorry!! you are not matching");
			}
		}

	}

}

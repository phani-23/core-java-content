package com.collectionframeworks;

import java.util.ArrayList;
import java.util.Arrays;

public class SecondSmallestIndex {

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<>(Arrays.asList(6,8,1,9,4,2,7,5));
		
		int smallest=Integer.MAX_VALUE;
		int secondSmallest=Integer.MAX_VALUE;
		
		for(int num:list) {
			if(num<smallest) {
				secondSmallest=smallest;
				smallest=num;
			}else if(num>smallest && num<secondSmallest) {
				secondSmallest=num;
			}
		}
		int position=list.indexOf(secondSmallest);
		
		System.out.println(smallest);
		System.out.println("second smallest number: "+secondSmallest);
		System.out.println("position of the number is: "+position);

	}

}

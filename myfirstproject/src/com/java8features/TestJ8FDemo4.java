package com.java8features;

import java.util.Arrays;
import java.util.List;

public class TestJ8FDemo4 {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);
        numbers.forEach(n -> {
            if(n % 2 == 0) System.out.println(n+" is even number");
            else if(n%2!=0) System.out.println(n+" is odd Number");
        });


	}

}

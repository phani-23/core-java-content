package com.multithreading;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class TestMTDemo6 {

	public static void main(String[] args) {
		
		ExecutorService es=Executors.newFixedThreadPool(3);
		
		Future<Integer> f1=es.submit(()->{
			Thread.sleep(1000);
			return 10;
		});
		
		Future<Integer> f2=es.submit(()->{
			Thread.sleep(2000);
			return 20;
		});
		
		try {
			System.out.println("f1: "+f1.get());
			System.out.println("f2: "+f2.get());
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
		
		es.shutdown();
		
	}

}

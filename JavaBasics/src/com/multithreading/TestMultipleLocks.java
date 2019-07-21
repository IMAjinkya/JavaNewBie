package com.multithreading;

import java.util.ArrayList;
import java.util.Random;

public class TestMultipleLocks {
	
	ArrayList<Integer> arr1 = new ArrayList<>();
	ArrayList<Integer> arr2 = new ArrayList<>();
	Random r = new Random();
	
	Object lock1 = new Object();
	Object lock2 = new Object();
	
	public void addOne(){
		arr1.add(r.nextInt(100));
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void addTwo(){
		arr2.add(r.nextInt(100));
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public void doWork(){
		for(int i = 0; i < 1000; i++){
			synchronized (lock1) {
				addOne();
			}
			synchronized (lock2) {
				addTwo();
			}
		}
	}
	
	public static void main(String[] args) {
		TestMultipleLocks tml = new TestMultipleLocks();
		
		long start = System.currentTimeMillis();
		
		Thread t1 = new Thread(new Runnable(){

			@Override
			public void run() {
				tml.doWork();
			}
		});
		
		Thread t2 = new Thread(new Runnable(){

			@Override
			public void run() {
				tml.doWork();
			}
		});
		
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Arr1 : "+tml.arr1.size() +"  Arr2 : "+tml.arr2.size());
		System.out.println("Time taken : "+(System.currentTimeMillis() - start));

	}

}

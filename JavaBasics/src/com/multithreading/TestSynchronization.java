package com.multithreading;

public class TestSynchronization {
	private static int count = 0;
	
	public static void main(String[] args) {
		
		Thread t1 = new Thread(new Runnable(){

			@Override
			public void run() {
				for (int i = 0; i < 10; i++) {
					count+=1;
				}	
			}
			
		});

	}

}

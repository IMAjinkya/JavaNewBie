package com.multithreading;

class Task extends Thread{
	public void run(){
		for (int i = 0; i < 10; i++) {
			System.out.println("Iteration :"+i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class TaskRunnable implements Runnable{
	
	public void run(){
		for (int i = 0; i < 10; i++) {
			System.out.println("Iteration :"+i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}



public class TestThreadCreation {
	public static void main(String[] args) throws InterruptedException{
		long startMills = System.currentTimeMillis();
		System.out.println("Start Main...!!!");
		Task t1 = new Task();
		t1.start();
		
		Thread th1 = new Thread(new TaskRunnable());
		th1.start();
		
		t1.join();
		System.out.println("Time taken for 1st thread: "+(System.currentTimeMillis() - startMills) + " millis");
		th1.join();
		
		System.out.println("Time taken for both threads: "+(System.currentTimeMillis() - startMills) + " millis");
	}
}

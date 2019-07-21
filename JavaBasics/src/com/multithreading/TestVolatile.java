package com.multithreading;

import java.util.Scanner;

class Thread1 extends Thread{
	private volatile boolean running = true;
	
	public void run(){
		while(running){
			System.out.println("Hello..!!");
		}
	}

	public void shutDown(){
		running = false;
		System.out.println("Shutting down the Thread...!!!");
	}
}

public class TestVolatile {

	public static void main(String[] args) {
		Thread1 t1 = new Thread1();
		t1.start();
		
		Scanner sc = new Scanner(System.in);
		sc.nextLine();
		
		t1.shutDown();
		
	}

}

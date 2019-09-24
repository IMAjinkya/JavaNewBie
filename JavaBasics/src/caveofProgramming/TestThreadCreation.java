package caveofProgramming;

import static com.util.Print.*;
import static com.util.Print.printMenu;

import java.util.Scanner;

class ThreadByInheritance extends Thread{

	@Override
	public void run() {
		super.run();
		for(int i = 0; i < 5; i++){
			System.out.println(this+" => Hello");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}


class ThreadByPolymorphism implements Runnable{

	public void run() {
		for(int i = 0; i < 5; i++){
			System.out.println(this+" => Hello");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class infiniteThread extends Thread{

	private volatile boolean running = true;
	
	public void run() {
		while(running){
			System.out.println(this+" => Hello");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void shutdown(){
		running = false;
	}
}

public class TestThreadCreation {
	public static Thread spawnThread(int threadType){
		Thread t1 = null;
		switch(threadType){
		case 1 : 
			t1 = new ThreadByInheritance();
			t1.start();
			break;
		case 2 :	
			t1 = new Thread(new ThreadByPolymorphism());
			t1.start();
			break;
		case 3 :
			t1 = new Thread(new Runnable() {
				
				@Override
				public void run() {
					for(int i = 0; i < 5; i++){
						System.out.println(this+" => Hello");
						try {
							Thread.sleep(100);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				}
			});
			t1.start();
		default :
			t1 = new Thread();
			System.out.println("Please choose valid option.");
		}
		
		return t1;
	}
	
	public static infiniteThread spawnInfiniteThread(){
		infiniteThread inft = new infiniteThread();
		inft.start();
		
		return inft;
	}
	
	public static void main(String[] args) throws InterruptedException{
		Scanner scan = null;
		try{
			do{
				int noofThreads = 0;
				int threadCreationtype = 0;
				scan = new Scanner(System.in);
				Thread t = null;
				infiniteThread t1 = null;
				
				print("Enter number of threads you want to create:");
				noofThreads = scan.nextInt();
				
				printMenu(
					"Thread By Inheritance",
					"Thread by Polymorphism",
					"Thread by anonymous inner class",
					"Infinite Thread (Hit 'Enter' to stop infinte execution)"
				);
				
				threadCreationtype = scan.nextInt();
				if(threadCreationtype == 4){
					print("Overriding no of Threads to : 1");
					noofThreads = 1;
				}
				
				for(int i = 0; i < noofThreads; i++ ){
					if(threadCreationtype == 4){
						t1 = spawnInfiniteThread();
					}
					else{
						t = spawnThread(threadCreationtype);
						t.join();
					}
				}
				
				if(threadCreationtype == 4){
					print("Please hit 'Enter' to stop infinite execution");
					String a = scan.next();
					t1.shutdown();
				}
				
				print("Do you want to continue (Y/N)?");
				
			}while("Y".equalsIgnoreCase(scan.next()));
		}
		finally{
			print("Closing Scanner...!!!");
			scan.close();
			printLearning(
				"Extend Thread \t: If you are overriding or existing Thread Method or adding new Method in Thread Class (i.e. shutDown())",
				"Implements Runnable \t: If you already extending another class and want to use default thread functionality."
			);
		}
	}	
}

package multiThreading.caveofProgramming.waitNotifySample;

import static com.util.Print.print;

import java.util.Scanner;
public class Processor {
	
	public void producer() throws InterruptedException{
		synchronized(this) {
			print("Prdoduced..!!!");
			this.wait();
			print("Resumed");
		}
	}
	
	public void consumer() throws InterruptedException{		
		
		Scanner scan = new Scanner(System.in);
		Thread.sleep(300);
		
		synchronized(this){
			print("Hit 'Enter' key to resumed.");
			scan.nextLine();
			print("Enter key pressed.(waiting for 5 secs)");
			this.notify();
			Thread.sleep(5000); 		//Notify waits till execution completes.		
		}
	}
}

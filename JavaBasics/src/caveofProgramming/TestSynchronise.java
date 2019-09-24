package caveofProgramming;

import static com.util.Print.*;

public class TestSynchronise {
	
	private int count;
	
	//Commented following and added this synchronized method. 
	public synchronized void increment(){
		count++;
	}
	
	public void doWork() throws InterruptedException{
		Thread t1 = new Thread(new Runnable(){
			public void run(){
				for(int i = 0; i < 10000; i++){
					//count++;
					increment();
				}
			}
		});
		
		Thread t2 = new Thread(new Runnable(){
			public void run(){
				for(int i = 0; i < 10000; i++){
					//count++;
					increment();
				}
			}
		});
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
	}
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		TestSynchronise tsync = new TestSynchronise();
		tsync.doWork();
		print("Count :" + tsync.count);
	}

}

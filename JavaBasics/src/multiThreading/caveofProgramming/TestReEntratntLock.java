package multiThreading.caveofProgramming;

import java.util.Scanner;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class TestReEntratntLock {
	
	private static int count = 0;
	private static Lock lock = new ReentrantLock();
	private static Condition condition = lock.newCondition();
	
	//public static synchronized void Increment(){
	public static void Increment(){
		for (int i = 0; i < 10000; i++) {
			count++;
		}
	}
	
	public static void method1() throws InterruptedException{
		lock.lock();
		System.out.println("Thread1 running...!!!");
		
		condition.await();
		
		System.out.println("Thread1 resumed..!!!");		
		Increment();
		
		lock.unlock();
	}
	
	public static void method2() throws InterruptedException{
		
		lock.lock();
		
		Thread.sleep(200);
		
		System.out.println("Hit Enter key...!!!");
		new Scanner(System.in).nextLine();
		System.out.println("Enter received..!!");
		condition.signal();
		
		Increment();
		
		lock.unlock();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1 = new Thread(new Runnable(){
			public void run(){
				try {
					method1();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		
		Thread t2 = new Thread(new Runnable(){
			public void run(){
				try {
					method2();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
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
		System.out.println(count);
	}

}

package multiThreading.caveofProgramming;

import static com.util.Print.*;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class TestProdConsumr {

	private static BlockingQueue<Integer> queue = new ArrayBlockingQueue<Integer>(10);
	
	private static void producer() throws InterruptedException{
		Random random = new Random();
		Thread.sleep(1000);
		while(true){
			Integer value = random.nextInt(100);
			queue.put(value);
			print("Added value: " + value + "; Queue Size is : "+queue.size());
		}
	}
	
	private static void consumer() throws InterruptedException{
		
		Random random = new Random();
		while(true){
			Thread.sleep(100);
			
			if(random.nextInt(10) == 0){
				Integer value = queue.take();
				print("Taken value: "+ value + "; Queue size is : "+queue.size());
			}
		}
	}
	
	public static void main(String[] args){
		Thread t1 = new Thread(new Runnable(){
			public void run(){
				try {
					producer();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		
		Thread t2 = new Thread(new Runnable(){
			public void run(){
				try {
					consumer();
				} catch (InterruptedException e) {
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
	}
}

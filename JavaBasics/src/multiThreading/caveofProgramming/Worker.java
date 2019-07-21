package multiThreading.caveofProgramming;

import static com.util.Print.print;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Worker {
	
	private List<Integer> l1 = new ArrayList<Integer>(); 
	private List<Integer> l2 = new ArrayList<Integer>();
	private Random random = new Random(100);
	
	Object obj1 = new Object();
	Object obj2 = new Object();
	
	public void main(){
		
		Long start = System.currentTimeMillis();
		print("Starting...!");
		
		Thread t1 = new Thread(new Runnable(){
			public void run(){
				process();
			}
		});
		Thread t2 = new Thread(new Runnable(){
			public void run(){
				process();
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
		
		
		
		
		print("Ending...!");
		print("Time taken : " +(System.currentTimeMillis() - start));
		print("List1 : "+l1.size());
		print("List2 : "+l2.size());
	}
	
	public void process(){
		
		for(int i = 0; i < 1000; i++){
			StageOne();
			StageTwo();
		}
	}
	
	//private synchronized void StageOne(){
	private void StageOne(){
		
		synchronized (obj1) {
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			l1.add(random.nextInt());
		}
	}
	
	//private synchronized void StageTwo(){
	private void StageTwo(){
		
		synchronized (obj2) {
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			l2.add(random.nextInt());
		}
	}
}

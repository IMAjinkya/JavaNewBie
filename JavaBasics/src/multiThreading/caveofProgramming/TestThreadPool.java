package multiThreading.caveofProgramming;

import static com.util.Print.print;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class Processor implements Runnable{
	int id;
	
	public Processor(){}
	public Processor(int id){
		this.id = id;
	}
	
	public void run(){
		print("Starting :" + id);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		print("Ending :" + id);
	}
}

public class TestThreadPool {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ExecutorService executor = Executors.newFixedThreadPool(2);
		
		for(int i = 0; i < 5; i++){
			executor.submit(new Processor(i));
		}
		executor.shutdown();
		
		print("All Task are submitted.");
		executor.awaitTermination(1, TimeUnit.DAYS);
		print("All Task are completed.");
	}
}

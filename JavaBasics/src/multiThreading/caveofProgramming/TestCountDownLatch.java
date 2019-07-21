package multiThreading.caveofProgramming;

import static com.util.Print.print;

import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class ProcessorCD implements Runnable{
	
	CountDownLatch latch;
	Random random = new Random();
	
	public ProcessorCD(CountDownLatch latch) {
		this.latch = latch;
	}

	@Override
	public void run() {
		try {
			Thread.sleep(random.nextInt(3000));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		latch.countDown();
		print("Started :"+latch.getCount());
	}
	
}

public class TestCountDownLatch {
	
	public static void main(String[] args) {	
		CountDownLatch latch = new CountDownLatch(3);
		ExecutorService executor = Executors.newFixedThreadPool(3);
		
		for(int i=0; i<3; i++){
			executor.submit(new ProcessorCD(latch));
		}
		
		try {
			latch.await();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		print("Completed..!!!");
	}

}

package multiThreading.caveofProgramming.pcLowLevelSynchro;

public class App {
	static final Processor processor = new Processor();
	
	public static void main(String[] args) {
		
		Thread t1 = new Thread(new Runnable(){
			public void run(){
				try {
					processor.producer();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		
		Thread t2 = new Thread(new Runnable(){
			public void run(){
				try {
					processor.consumer();
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
		
	}

}

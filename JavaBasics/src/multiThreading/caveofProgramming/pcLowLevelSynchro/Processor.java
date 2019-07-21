package multiThreading.caveofProgramming.pcLowLevelSynchro;

import static com.util.Print.print;

import java.util.LinkedList;
import java.util.Random;
public class Processor {
	
	final int LIMIT = 10; 
	Object lock = new Object();
	
	//shared resource
	LinkedList<Integer> linkedList = new LinkedList<Integer>();
	
	public void producer() throws InterruptedException{
		int count = 0;
		
		while(true){
			synchronized(lock){
				while(linkedList.size() == LIMIT){
					lock.wait();
				}
				//print("Produced :"+ count + "LinkedList size:"+ linkedList.size());
				linkedList.add(count++);
				lock.notify();
			}
		}
	}
	
	public void consumer() throws InterruptedException{
		Random random = new Random();
		
		while(true){
			synchronized(lock){
				while(linkedList.size() == 0){
					lock.wait();
				}
				System.out.println(" LinkedList size:"+ linkedList.size() +";");
				int value = linkedList.removeFirst();
				System.out.print("Consumed :"+ value); 
				lock.notify();
				
			}
			
			Thread.sleep(random.nextInt(1500));
		}
	}
}

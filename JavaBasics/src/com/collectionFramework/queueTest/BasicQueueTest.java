package com.collectionFramework.queueTest;

import java.util.PriorityQueue;
import java.util.Queue;

public class BasicQueueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> q = new PriorityQueue<Integer>();
		q.add(10);
		q.add(20);
		q.add(30);
		
		System.out.println("Poll :"+q.poll());
		System.out.println("Queue:"+q);
		System.out.println("Peek:"+q.peek());
		System.out.println("Queue:"+q);
		System.out.println("Peek:"+q.peek());
		
	}

}

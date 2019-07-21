package com.collectionFramework;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class TestDoubts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Derive> ab = new ArrayList<>();
		
		//ArrayList
		Queue<Integer> q = new PriorityQueue<>(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				if(o1 < o2)
					return 1;
				else if(o1 > o2){
					return -1;
				}
				else{
					return 0;
				}
			}
		});
		q.add(10);
		q.add(30);
		q.add(3);
		q.add(7);
		
		while (!q.isEmpty()) {
			System.out.println(q.poll());
		}
		
		int oldCapacity = 10;
		int newCapacity = oldCapacity + (oldCapacity >> 1);
		System.out.println(newCapacity);
		
	}

}

class Base{
	
}

class Derive extends Base{
	
}

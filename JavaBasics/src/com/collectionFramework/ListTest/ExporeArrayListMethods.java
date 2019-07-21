package com.collectionFramework.ListTest;

import java.util.ArrayList;
import java.util.List;

public class ExporeArrayListMethods {

	public static void main(String[] args) {
		List<Integer> al = new ArrayList<>();
		for (int i= 0; i < 10; i++) {
			al.add(i);
		}

		System.out.println("10>>1:"+ (10 >> 1));
		System.out.println("11>>1:"+ (11 >> 1));
		System.out.println("12>>1:"+ (12 >> 1));
		
		System.out.println(al.toArray().length);
		al.add(10);
		System.out.println(al.toArray().length);
	}

}

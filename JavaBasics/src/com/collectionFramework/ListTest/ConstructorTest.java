package com.collectionFramework.ListTest;

import java.util.ArrayList;

public class ConstructorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> a = new ArrayList<>();
		
		for(int i = 0; i < 10; i++){
			a.add(0);
		}
		a.add(1);
		System.out.println(a);
	}

}

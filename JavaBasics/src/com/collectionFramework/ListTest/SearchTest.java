package com.collectionFramework.ListTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SearchTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(60);
		arr.add(40);
		arr.add(20);
		System.out.println("initial:"+arr);
		Collections.sort(arr);
		System.out.println("After Sort:"+arr);
		
		int searchInt;
		String ans = "";
		Scanner s = new Scanner(System.in);
		do{
			System.out.println("Insert int to search..!");
			searchInt = s.nextInt();
			
			int index = Collections.binarySearch(arr, searchInt);
			
			System.out.println("SearchIndex :"+index);
			
			if(index < 0){
				arr.add(Math.abs(index)-1, searchInt);
				System.out.println("After insert: "+arr);
			}
			System.out.println("do you want to continue ?(Y/N)");
			ans = s.next();
		}while("Y".equals(ans));
		
		s.close();
		System.out.println("Thank you...!!!");
	}
}

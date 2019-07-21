package com.collectionFramework.mapTest;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TestMapSortingByKeys {

	public static void main(String[] args) {
		
		HashMap<Integer,SimpleDateFormat> emp = new HashMap<>();
		emp.put(1,new SimpleDateFormat("20160401"));
		emp.put(21,new SimpleDateFormat("20160601"));
		emp.put(11,new SimpleDateFormat("20150401"));
		
		Set<Entry<Integer, SimpleDateFormat>> entrySet = emp.entrySet();
		ArrayList<Map.Entry<Integer, SimpleDateFormat>> arraySetEntry = new ArrayList<>(entrySet);
		
		System.out.println("Before Sort");
		for(Map.Entry<Integer,SimpleDateFormat>  entry: arraySetEntry){
			System.out.println(entry.getKey() +":"+entry.getValue().toPattern());
		}
		
		extracted(arraySetEntry);
		
		System.out.println("\nAfter Sort");
		for(Map.Entry<Integer,SimpleDateFormat>  entry: arraySetEntry){
			System.out.println(entry.getKey() +":"+entry.getValue().toPattern());
		}
		

	}

	private static void extracted(ArrayList<Entry<Integer,SimpleDateFormat>> arraySetEntry) {
		Collections.sort(arraySetEntry,new Comparator<Map.Entry<Integer, SimpleDateFormat>>(){

			@Override
			public int compare(Map.Entry<Integer, SimpleDateFormat> o1, Map.Entry<Integer, SimpleDateFormat> o2) {
				SimpleDateFormat d1 = ((Map.Entry<Integer,SimpleDateFormat>)o1).getValue();
				SimpleDateFormat d2 = ((Map.Entry<Integer,SimpleDateFormat>)o2).getValue();
				
				int dI1 = Integer.parseInt(d1.toPattern());
				int dI2 = Integer.parseInt(d2.toPattern());
				if(dI1 < dI2)
					return -1;
				else if(dI1 > dI2)
					return 1;
				else
					return 0;
			}
			
		});
	}

}

package com.collectionFramework.mapTest;

import java.util.HashMap;
import java.util.Hashtable;

import static com.util.Print.*;

public class MapTest {
	public static void main(String[] args){
		//1. Return value of put
		HashMap h = new HashMap<>();
		System.out.println(h.put(101,"Ajinkya"));
		System.out.println(h.put(101,"Ashwini"));
		
		//2. Hash bucketing
		//HashMap h1 = new HashMap<>();
		//Hashtable h1 = new Hashtable<>();
		Hashtable h1 = new Hashtable<>();
		for(int i = 0; i < 20; i++){
			h1.put(new TempHashObj(i),"Value:"+i);
		}
		//Observe output for HashMap and Hashtable
		print(h1);
		
	}
	
}

class TempHashObj{
	int value;
	public TempHashObj(int value) {
		this.value = value;
	}
	
	public int hashCode(){
		return this.value % 9;
	}
	
	public String toString(){
		return this.value+"";
	}
}

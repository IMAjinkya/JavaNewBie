package com.collectionFramework.setTest;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class TestLinkedHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<String> lhs = new LinkedHashSet<>();
		lhs.add("Ajinkya");
		lhs.add("Rane");
		System.out.println(lhs);
		
		HashSet<String> hs = new HashSet<>();
		hs.add("Ajinkya");
		hs.add("Rane");
		System.out.println(hs);
	}

}

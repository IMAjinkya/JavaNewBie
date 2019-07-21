package com.basic.string;

public class BestPractise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = operation();
		
		//BEST practice
		if("SUCCESS".equals(s1))
			System.out.println("true");
		else
			System.out.println("false");
		
		if(s1.equals("SUCCESS")){
			System.out.println("true");
		}
	}
	
	public static String operation(){
		return null;
	}

}

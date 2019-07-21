package com.basic.string;

public class StringConstantPoolTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Hello".concat("World");					//String Pool HelloWorld 
		String s3 = new String("HelloWorld"); 					// Heap
		String s2 = s1.intern();								//	
			
		System.out.println(s1 == s2); //false
		System.out.println(s1 == s3); //false
		System.out.println(s2 == s3); //false
		
		String s4 = "HelloWorld";
		String s5 = s4.intern();
		System.out.println(s4 == s5); //true
	}

}

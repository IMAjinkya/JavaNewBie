package com.basic.string;

import static com.util.Print.*;

public class SubStringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Ajinkya Ashok Rane";
		
		String s2 = s1.substring(2,8);
		System.out.println(s2);
		
		//System.out.println(s1.substring(30)); //!ERROR :  java.lang.StringIndexOutOfBoundsException
		System.out.println("Substring with string length : (Blank)'"+s1.substring(s1.length())+"'"); 
		
		printLearning(
			"Upto JDK 1.6 s2 was having same charArray as of s1 and hence having memory leak.",
			"subString() throws StringIndexOutOfBoundsException when given higher number in input, but handles when given String Length and output is blank String."
		);
	}

}

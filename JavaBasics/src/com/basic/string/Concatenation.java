package com.basic.string;

import static com.util.Print.*;
public class Concatenation {
	public static void main(String[] args) {
		String mango = "mango";
		String s = "abc" + mango + "def" + 47;
		System.out.println(s);
		
		print(
			"Check with javap command :\n"
			+ "The important part to notice is the introduction by the compiler of the java.lang.StringBuilder class.\n"
			+ "There was no mention of StringBuilder in the source code, but the compiler decided to use it anyway,\n"
			+ "because it is much more efficient.");
	}
}

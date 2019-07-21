package com.basic.string;

public class WhitherStringBuilder {
	/*
	 * Notice 8: and 35:, which together form a loop. 
	 * 8: does an "integer compare greater than or equal to" of the operands on the stack and jumps to 38: when the loop is done. 
	 * 35: is a goto back to the beginning of the loop, at 5:. 
	 * The important thing to note is that the StringBuilder construction happens inside this loop, 
	 * which means you’re going to get a new StringBuilder object every time you pass through the loop.
	 */
	public String implicit(String[] fields) {
		String result = "";
		for (int i = 0; i < fields.length; i++)
			result += fields[i];
		return result;
	}
	
	
	/*
	 * Not only is the loop code shorter and simpler, the method only creates a single StringBuilder object. 
	 * Creating an explicit StringBuilder also allows you to preallocate its size if you have extra information about how big 
	 * it might need to be, so that it doesn’t need to constantly reallocate the buffer.
	 */
	public String explicit(String[] fields) {
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < fields.length; i++)
			result.append(fields[i]);
		return result.toString();
	}
}

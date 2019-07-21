package com.regEx;

import java.util.regex.*;
import static com.util.Print.*;

public class StartEnd {
	public static String input = "As long as there is injustice, whenever a\n"
			+ "Targathian baby cries out, wherever a distress\n" + "signal sounds among the stars ... We’ll be there.\n"
			+ "This fine ship, and this fine crew ...\n" + "Never give up! Never surrender!";

	private static class Display {
		private boolean regexPrinted = false;
		private String regex;

		Display(String regex) {
			this.regex = regex;
		}

		void display(String message) {
			if (!regexPrinted) {
				print(regex);
				regexPrinted = true;
			}
			print(message);
		}
	}

	static void examine(String s, String regex) {
		Display d = new Display(regex);
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(s);
		while (m.find())
			d.display("find() ‘" + m.group() + "‘ start = " + m.start() + " end = " + m.end());
		if (m.lookingAt()) // No reset() necessary
			d.display("lookingAt() start = " + m.start() + " end = " + m.end());
		if (m.matches()) // No reset() necessary
			d.display("matches() start = " + m.start() + " end = " + m.end());
	}

	public static void main(String[] args) {
		for (String in : input.split("\n")) {
			print("input : " + in);
			print("===================================");
			for (String regex : new String[] { "\\w*ere\\w*", "\\w*ever", "T\\w+", "Never.*?!" })
				examine(in, regex);
			print();
		}
		
		printLearning(
			"find() method can be used to discovermultiple pattern matchesin the CharSequence. It is like an iterator, moving forward through the input string.",
			"matches() method is successfull if entire input string matches with pattern.",
			"lookingAt() method is successfull if pattern matches at starting at the begining" 
		);
	}
}
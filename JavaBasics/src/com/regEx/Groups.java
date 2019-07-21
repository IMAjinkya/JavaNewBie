package com.regEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import static com.util.Print.*;

public class Groups {
	static public final String POEM = "Twas brillig, and the slithy toves\n" + "Did gyre and gimble in the wabe.\n"
			+ "All mimsy were the borogoves,\n" + "And the mome raths outgrabe.\n\n"
			+ "Beware the Jabberwock, my son,\n" + "The jaws that bite, the claws that catch.\n"
			+ "Beware the Jubjub bird, and shun\n" + "The frumious Bandersnatch.";
	
	static public final String TEST = "ABCDBCDACBCDABC";
	
	public static void main(String[] args) {
		//The goal is to capture the last three words on each line; the end of a line is delimited by ‘$’.
		//NewLine is taken care by pattern flag (?m) 
		Matcher m = Pattern.compile("(?m)(\\S+)\\s+((\\S+)\\s+(\\S+))$").matcher(POEM);
		
		while (m.find()) {
			for (int j = 0; j <= m.groupCount(); j++){
				printnb(j+": [" + m.group(j) + "]");
				print();
			}
			print();
		}
		
		//Simple example
		Matcher m1 = Pattern.compile("(A(B(C)+)+D)").matcher(TEST);
		while (m1.find()) {
			for (int j = 0; j <= m1.groupCount(); j++){
				printnb(j+": [" + m1.group(j) + "] [ Start:"+m1.start(j)+" | End:"+m1.end(j)+"]");
				print();
			}
			print();
		}
	}
}

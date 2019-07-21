package com.basic.string;

import static com.util.Print.*;

public class StringPoolTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = new String("Cat123");
		String s2 = "Cat123";
		String s3 = new String("Cat123");
		String s4 = new String("Cat123").intern();
		String s5 = "Cat123";
		
		String s6 = new String("ABC_asd").intern();
		String s7 = "ABC_asd";
		
		String s8 = s7+"";
		
		System.out.println("S1(Heap) == S2(Pool) \t\t: "+(s1 == s2));
		System.out.println("S1(Heap) == S3(Heap) \t\t: "+(s1 == s3));
		System.out.println("S1(Heap) == S4(Pool-intern) \t: "+(s1 == s4));
		System.out.println("S2(Pool) == S4(Pool-intern) \t: "+(s2 == s4));
		System.out.println("S2(Pool) == S5(Pool) \t\t: "+(s2 == s5));
		System.out.println("S6(Pool-intern) == S7(Pool) \t: "+(s6 == s7));
		System.out.println("S6(Pool) == S8(Heap) \t\t: "+(s6 == s8));
		
		printLearning(
			"s1 with 'new' operator allocates memory in Heap",
			"s2 creates string object in StringPool.",
			"For every new operator different space is allocated in heap hence s1==s3 is false.",
			"intern() refers String from StringPool if exists, and if not exist then creates one in StringPool and hence s6 == s7 is true",
			"Compiler puts string values in pool that are constant right from compile time and s8 value is dependent on s7 variable at runtime, hence it’s created in heap."
		);
	}

}

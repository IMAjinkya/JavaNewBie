package com.rtti;

import java.util.Random;
import static com.util.Print.*;

class Initable {
	static final int staticFinal = 47;
	static final int staticFinal2 = ClassInitialization.rand.nextInt(1000);
	static {
		System.out.println("Initializing Initable");
	}
}

class Initable2 {
	static int staticNonFinal = 147;
	static {
		System.out.println("Initializing Initable2");
	}
}

class Initable3 {
	static int staticNonFinal = 74;
	static {
		System.out.println("Initializing Initable3");
	}
}

public class ClassInitialization {
	public static Random rand = new Random(47);

	public static void main(String[] args) throws Exception {
		
		print("Class literal : .Class (Lazy Initialization)\n=================================");
		Class initable = Initable.class;
		System.out.println("After creating Initable ref");
		print();
		
		// Does not trigger initialization:
		System.out.println("Accessing static final (CompileTime CONST) : "+Initable.staticFinal);
		// Does trigger initialization:
		System.out.println("Accessing static final (non CompileTime CONST) : "+Initable.staticFinal2);
		// Does trigger initialization:
		System.out.println("Accessing static non final (non CompileTime CONST): "+Initable2.staticNonFinal);
		
		print();
		print("static forName() (Early initialization)\n================================");
		Class initable3 = Class.forName("com.rtti.Initable3");
		System.out.println("After creating Initable3 ref");
		System.out.println("Accessing static non final (non CompileTime CONST) : "+Initable3.staticNonFinal);
	}
}

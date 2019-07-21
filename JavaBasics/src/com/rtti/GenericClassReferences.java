package com.rtti;

import static com.util.Print.*;

public class GenericClassReferences {
	
	static void genClassRef(){
		Class intClass = int.class;
		print("Class object with 'Class'(Ordinary) \t int.class \t: "+intClass);
		
		Class<Integer> genericIntClass = int.class;
		print("Class object with 'Class<Integer>' \t int.class \t: "+genericIntClass);
		genericIntClass = Integer.class; // Same thing
		print("Class object with 'Class<Integer>' \t Integer.class \t: "+genericIntClass);
		
		intClass = double.class;
		print("Class object with 'Class'(Generic) \t double.class \t: "+intClass);
		
		//genericIntClass = double.class; // Illegal (Can not conver class DOUBLE to class INTEGER)
		print("Class object with 'Class'<Integer> \t double.class \t: ERROR => Can not assign");
		
		//Class<Number> genericNumClass = int.class;
		print("Class object with 'Class'<Number> \t int.class \t: ERROR => Integer Class object is not a subclass of the Number Class");
	}
	
	static void wildCardClassRef(){
		Class<? extends Number> bounded = int.class;
		print("Class object with 'Class<? extends Number>' \t int.class \t: "+bounded);
		
		bounded = double.class;
		print("Class object with 'Class<? extends Number>' \t double.class \t: "+bounded);
		
		bounded = Number.class;
		print("Class object with 'Class<? extends Number>' \t Number.class \t: "+bounded);
	}
	
	public static void main(String[] args) {
		genClassRef();
		print();
		wildCardClassRef();
	}
}
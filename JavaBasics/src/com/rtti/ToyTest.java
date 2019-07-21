package com.rtti;

import static com.util.Print.*;

interface HasBatteries {}

interface Waterproof {}

interface Shoots {}

class Toy {
	// Comment out the following default constructor
	// to see NoSuchMethodError from (*1*)
	Toy() {}

	Toy(int i) {}
}

class FancyToy extends Toy implements HasBatteries, Waterproof, Shoots {
	FancyToy() { super(1); }
}

public class ToyTest {
	static void printInfo(Class cc) {
		print("Class name: " + cc.getName() + " is interface? [" + cc.isInterface() + "]");
		print("Simple name: " + cc.getSimpleName());
		print("Canonical name : " + cc.getCanonicalName());
	}

	public static void main(String[] args) {
		Class c = null;
		print("Class.forName()\n=================");
		try {
			c = Class.forName("com.rtti.FancyToy");
		} catch (ClassNotFoundException e) {
			print("Can’t find FancyToy");
			System.exit(1);
		}
		printInfo(c);
		print();
		
		print("Class.getInterfaces()\n=================");
		for (Class face : c.getInterfaces()){
			printInfo(face);
			print("-----------------------------");
		}
		print();
		
		print("Class.getSuperclass()\n=================");
		Class up = c.getSuperclass();
		Object obj = null;
		try {
			// Requires default constructor:
			obj = up.newInstance();
		} catch (InstantiationException e) {
			print("Cannot instantiate");
			System.exit(1);
		} catch (IllegalAccessException e) {
			print("Cannot access");
			System.exit(1);
		}
		printInfo(obj.getClass());
	}
}

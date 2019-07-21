package com.generics.tuple;

public class ThreeTuple<C, D, E>{
	public final C first;
	public final D second;
	public final E third;

	public ThreeTuple(C c, D d, E e) {
		//super(a, b);
		first = c;
		second = d;
		third = e;
	}

	public String toString() {
		return "(" + first + ", " + second + ", " + third + ")";
	}
}
package com.basic.exception;

import static com.util.Print.*; 

public class Rethrowing {
	public static void f() throws Exception {
		System.out.println("originating the exception in f()");
		throw new Exception("thrown from f()");
	}

	public static void g() throws Exception {
		try {
			f();
		} catch (Exception e) {
			System.out.println("Inside g(),e.printStackTrace()");
			e.printStackTrace(System.out);
			throw e;
		}
	}

	public static void h() throws Exception {
		try {
			f();
		} catch (Exception e) {
			System.out.println("Inside h(),e.printStackTrace()");
			e.printStackTrace(System.out);
			throw (Exception) e.fillInStackTrace();
		}
	}

	public static void main(String[] args) {
		
		try {
			g();
		} catch (Exception e) {
			System.out.println("main: printStackTrace()");
			e.printStackTrace(System.out);
		}
		try {
			h();
		} catch (Exception e) {
			System.out.println("main: printStackTrace()");
			e.printStackTrace(System.out);
		}
		finally{
			printLearning(
				"Rethrowing an exception causes it to go to the execption handlers in the next higher context.",
				"Any furthur catch clauses for same try block are still ignored.",
				"The line where fillInStackTrace() is called becomes the new ppoint of origin of the exception.",
				"Rethrowing different exception gives same effect where original exception info is lost."
			);
		}
	}
}

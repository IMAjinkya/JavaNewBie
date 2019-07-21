package com.basic.exception;

import java.io.*;
import java.util.logging.*;
import static com.util.Print.*;

class LoggingException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = -74592482632276338L;
	private static Logger logger = Logger.getLogger("LoggingExceptions");
	
	public LoggingException(){
		StringWriter trace = new StringWriter();
		printStackTrace(new PrintWriter(trace));
		logger.severe(trace.toString());
	}
	
}
public class LoggingExceptions {
	public static void main(String[] args) {
		try {
			throw new LoggingException();
		}
		catch(LoggingException e) {
			System.err.println("Caught "+ e);		
		}
		
		try {
			throw new LoggingException();
		}
		catch(LoggingException e) {
			System.err.println("Caught "+ e);	
		}
		
		printLearning("To produce the String for the logging message, we’d like to have the stack trace where the exception is thrown, "
				+ "\n   But printStackTrace( ) doesn’t produce a String by default. ",
				"To get a String, we need to use the overloaded printStackTrace( ) that takes a java.io.PrintWriter object as an argument"
		);

	}

}

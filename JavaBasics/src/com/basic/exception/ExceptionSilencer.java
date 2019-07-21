package com.basic.exception;

import static com.util.Print.*;

public class ExceptionSilencer {
	@SuppressWarnings("finally")
	public static void main(String[] args) {
		try {
			throw new RuntimeException();
		} finally {
			// Using ‘return’ inside the finally block
			// will silence any thrown exception.
			printLearning(
				"Return call from finally clause looses exception thrown from catch clause."
			);
			return;
			
		}
	}
}

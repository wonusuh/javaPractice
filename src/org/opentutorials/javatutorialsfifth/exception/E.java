package org.opentutorials.javatutorialsfifth.exception;

import java.io.IOException;

class E {
	protected void throwArithmeticException() {
		throw new ArithmeticException();
	}

	protected void throwIOException() {
		try {
			throw new IOException();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	protected void throwIOException2() throws IOException {
		throw new IOException();
	}
}

package org.opentutorials.javatutorialsfourth.exception;

class DivideException extends Exception {
	int left, right;

	DivideException() {
		super();
	}

	DivideException(String message, int left, int right) {
		super(message);
		this.left = left;
		this.right = right;
	}
}

class Calculator {
	int left, right;

	Calculator(int left, int right) {
		this.left = left;
		this.right = right;
	}

	public void divide() throws DivideException {
		if (this.right == 0) {
			throw new DivideException("Diving by 0 is not allowed.", this.left, this.right);
		}
		System.out.print(this.left / this.right);
	}
}

public class CalculatorDemo {
	public static void main(String[] args) {
		Calculator c1 = new Calculator(10, 0);
		try {
			c1.divide();
		} catch (DivideException e) {
			System.out.println(e.toString());
			System.out.println(e.left);
			System.out.println(e.right);
		}
	}
}

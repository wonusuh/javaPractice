package org.opentutorials.javatutorialssecond.exception;

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

	public void setOperands(int left, int right) {
		this.left = left;
		this.right = right;
	}

	public void divide() throws DivideException {
		if (this.right == 0) {
			throw new DivideException("0으로 나눌 수 없습니다.", this.left, this.right);
		}
	}
}

public class CalculatorDemo {
	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		c1.setOperands(10, 0);
		try {
			c1.divide();
		} catch (DivideException e) {
			System.out.println(e.getMessage());
			System.out.println(e.left);
			System.out.println(e.right);
		}
	}
}

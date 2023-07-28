package org.opentutorials.javatutorialsfifth.exception;

class DivideException extends /* Runtime */Exception {
	protected int left, right;

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
	protected int left, right;

	protected Calculator(int left, int right) {
		this.left = left;
		this.right = right;
	}

	protected void divede() throws DivideException {
		if (right == 0) {
			throw new DivideException("0으로 나눌 수 없습니다.", left, right);
		}
		System.out.print(left / right);
	}
}

public class CalculatorDemo {
	public static void main(String[] args) {
		Calculator c1 = new Calculator(10, 0);
		try {
			c1.divede();
		} catch (DivideException e) {
			System.out.println(e.getMessage());
			System.out.println(e.left);
			System.out.println(e.right);
		}
	}
}

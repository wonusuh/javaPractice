package org.opentutorials.javatutorialsthird.exception;

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
			throw new DivideException("0으로 나눌 수 없습니다.", left, right);
		}
		System.out.print("계산결과는 ");
		System.out.print(this.left / this.right);
		System.out.println(" 입니다.");
	}
}

public class CalculatorDemo {
	public static void main(String[] args) {
		Calculator c1 = new Calculator(10, 0);
		try {
			c1.divide();
		} catch (DivideException e) {
			System.out.println(e.getMessage());
			System.out.println("left : " + e.left);
			System.out.println("right : " + e.right);
		}
	}
}

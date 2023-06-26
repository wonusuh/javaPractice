package org.opentutorials.javatutorialsthird.exception;

class Calculator {
	int left, right;

	Calculator(int left, int right) {
		this.left = left;
		this.right = right;
	}

	public void divide() {
		if (right == 0) {
			throw new ArithmeticException("0으로 나눌 수 없습니다.");
		}
		try {
			System.out.print("계산결과는 ");
			System.out.print(this.left / this.right);
			System.out.println(" 입니다.");
		} catch (Exception e) {
			System.out.println("\n\ne.getMessage()\n" + e.getMessage());
			System.out.println("\n\ne.toString()\n" + e.toString());
			System.out.println("\n\ne.printStackTrace()");
			e.printStackTrace();
		}
	}
}

public class CalculatorDemo {
	public static void main(String[] args) {
		Calculator c1 = new Calculator(10, 0);
		try {
			c1.divide();
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}
	}
}

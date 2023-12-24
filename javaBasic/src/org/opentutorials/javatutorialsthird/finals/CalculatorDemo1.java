package org.opentutorials.javatutorialsthird.finals;

class Calculator {
	static final double PI = 3.14;
	int left, right;

	Calculator(int left, int right) {
		this.left = left;
		this.right = right;
		// Calculator.PI = 6;
	}

	int _sum() {
		return this.left + this.right;
	}

	public void sum() {
		System.out.println(_sum());
	}

	public void avg() {
		System.out.println(_sum() / 2);
	}
}

public class CalculatorDemo1 {
	public static void main(String[] args) {
		Calculator c1 = new Calculator(10, 20);
		System.out.println(c1.PI);
		// Calculator.PI = 10;
		System.out.println(c1.PI);
	}
}

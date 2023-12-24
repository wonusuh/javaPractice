package org.opentutorials.javatutorialsfifth.classinstance;

class Calculator {
	protected static final double PI = (float) 3.14F;
	private int left, right;

	Calculator(int left, int right) {
		this.left = left;
		this.right = right;
	}

	public void sum() {
		System.out.println(this.left + this.right);
	}

	public void avg() {
		System.out.println((this.left + this.right) / 2);
	}
}

public class CalculatorDemo1 {
	public static void main(String[] args) {
		Calculator c1 = new Calculator(10, 20);
		System.out.println(c1.PI);

		Calculator c2 = new Calculator(20, 40);
		System.out.println(c2.PI);

		System.out.println(Calculator.PI);
	}
}

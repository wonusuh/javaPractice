package org.opentutorials.javatutorialsfifth.inheritance.example1;

class Calculator {
	protected int left, right;

	Calculator(int left, int right) {
		this.left = left;
		this.right = right;
	}

	protected void sum() {
		System.out.println(this.left + this.right);
	}

	protected void avg() {
		System.out.println((this.left + this.right) / 2);
	}
}

class SubtractionalCalculator extends Calculator {
	SubtractionalCalculator(int left, int right) {
		super(left, right);
	}

	protected void subtract() {
		System.out.println(this.left - this.right);
	}
}

public class CalculatorDemo1 {
	public static void main(String[] args) {
		SubtractionalCalculator c1 = new SubtractionalCalculator(10, 20);
		c1.sum();
		c1.avg();
		c1.subtract();
		SubtractionalCalculator c2 = new SubtractionalCalculator(20, 40);
		c2.sum();
		c2.avg();
		c2.subtract();
	}
}

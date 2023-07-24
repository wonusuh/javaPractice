package org.opentutorials.javatutorialsfifth.overriding.example1;

class Calculator {
	protected int left, right;

	Calculator(int left, int right) {
		this.left = left;
		this.right = right;
	}

	protected void sum() {
		System.out.println(this.left + this.right);
	}

	protected int avg() {
		return (this.left + this.right) / 2;
	}
}

class SubtractionalCalculator extends Calculator {
	SubtractionalCalculator(int left, int right) {
		super(left, right);
	}

	protected void sum() {
		System.out.println("실행 결과는 " + (this.left + this.right) + "입니다.");
	}

	protected void subtract() {
		System.out.println(this.left - this.right);
	}

	protected int avg() {
		return super.avg();
	}
}

public class CalculatorDemo {
	public static void main(String[] args) {
		SubtractionalCalculator c1 = new SubtractionalCalculator(10, 20);
		c1.sum();
		c1.subtract();
		System.out.println("실행 결과는 " + c1.avg());
	}
}

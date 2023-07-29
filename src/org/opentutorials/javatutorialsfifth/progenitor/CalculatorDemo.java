package org.opentutorials.javatutorialsfifth.progenitor;

class Calculator {
	protected int left, right;

	protected Calculator(int left, int right) {
		this.left = left;
		this.right = right;
	}

	protected void sum() {
		System.out.println(left + right);
	}

	protected void avg() {
		System.out.println((left + right) / 2);
	}

	public String toString() {
		return super.toString() + ", left : " + left + ", right : " + right;
	}
}

public class CalculatorDemo {
	public static void main(String[] args) {
		Calculator c1 = new Calculator(10, 20);
		System.out.println(c1);
		System.out.println(c1.toString());
	}
}

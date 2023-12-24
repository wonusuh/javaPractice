package org.opentutorials.javatutorialsfourth.accessmodifier;

class Calculator {
	private int left, right;

	Calculator(int left, int right) {
		this.left = left;
		this.right = right;
	}

	private int sum() {
		return this.left + this.right;
	}

	private int avg() {
		return (this.left + this.right) / 2;
	}

	public void sumDecoPlus() {
		System.out.println("+++++" + sum() + "+++++");
	}

	public void sumDecoMinus() {
		System.out.println("-----" + sum() + "-----");
	}
}

public class CalculatorDemo {
	public static void main(String[] args) {
		Calculator c = new Calculator(10, 20);
		c.sumDecoPlus();
		c.sumDecoMinus();
	}
}

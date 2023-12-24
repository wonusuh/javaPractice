package org.opentutorials.javatutorialsfifth.abstractclass.example3;

abstract class Calculator {
	protected int left, right;

	protected Calculator(int left, int right) {
		this.left = left;
		this.right = right;
	}

	protected abstract void sum();

	protected abstract void avg();

	protected void run() {
		sum();
		avg();
	}

	protected int _sum() {
		return this.left + this.right;
	}
}

class CalculatorDecoPlus extends Calculator {
	protected CalculatorDecoPlus(int left, int right) {
		super(left, right);
	}

	@Override
	protected void sum() {
		System.out.println("+ sum : " + (_sum()));
	}

	@Override
	protected void avg() {
		System.out.println("+ avg : " + (_sum()) / 2);
	}
}

class CalculatorDecoMinus extends Calculator {
	protected CalculatorDecoMinus(int left, int right) {
		super(left, right);
	}

	@Override
	protected void sum() {
		System.out.println("- sum : " + (_sum()));
	}

	@Override
	protected void avg() {
		System.out.println("- avg : " + (_sum()) / 2);
	}
}

public class CalculatorDemo {
	public static void main(String[] args) {
		CalculatorDecoPlus c1 = new CalculatorDecoPlus(10, 20);
		c1.run();
		CalculatorDecoMinus c2 = new CalculatorDecoMinus(10, 20);
		c2.run();
	}
}

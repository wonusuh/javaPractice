package org.opentutorials.javatutorialsfourth.abstractclass.example3;

abstract class Calculator {
	int left, right;

	Calculator(int left, int right) {
		this.left = left;
		this.right = right;
	}

	public abstract void sum();

	public abstract void avg();

	public void run() {
		sum();
		avg();
	}

	int _sum() {
		return this.left + this.right;
	}
}

class CalculatorDecoPlus extends Calculator {
	CalculatorDecoPlus(int left, int right) {
		super(left, right);
	}

	@Override
	public void sum() {
		System.out.println("+ sum : " + _sum());
	}

	@Override
	public void avg() {
		System.out.println("+ avg : " + (_sum() / 2));
	}
}

class CalculatorDecoMinus extends Calculator {
	CalculatorDecoMinus(int left, int right) {
		super(left, right);
	}

	@Override
	public void sum() {
		System.out.println("- sum : " + _sum());
	}

	@Override
	public void avg() {
		System.out.println("- avg : " + (_sum() / 2));
	}
}

public class CalculatorDemo {
	public static void main(String[] args) {
		CalculatorDecoPlus c1 = new CalculatorDecoPlus(10, 20);
		c1.run();
		CalculatorDecoMinus c2 = new CalculatorDecoMinus(20, 40);
		c2.run();
	}
}

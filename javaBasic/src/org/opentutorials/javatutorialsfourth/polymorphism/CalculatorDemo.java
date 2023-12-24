package org.opentutorials.javatutorialsfourth.polymorphism;

abstract class Calculator {
	int left, right;

	Calculator(int left, int right) {
		this.left = left;
		this.right = right;
	}

	int _sum() {
		return this.left + this.right;
	}

	public abstract void sum();

	public abstract void avg();

	public void run() {
		sum();
		avg();
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
	public static void execute(Calculator cal) {
		System.out.println("consequence of execution");
		cal.run();
	}

	public static void main(String[] args) {
		Calculator c1 = new CalculatorDecoPlus(10, 20);
		Calculator c2 = new CalculatorDecoMinus(20, 40);
		execute(c1);
		execute(c2);
	}
}

package org.opentutorials.javatutorialsthird.polymorphism;

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

	public void sum() {
		System.out.println("+ sum : " + _sum());
	}

	public void avg() {
		System.out.println("+ avg : " + (_sum() / 2));
	}
}

class CalculatorDecoMinus extends Calculator {
	CalculatorDecoMinus(int left, int right) {
		super(left, right);
	}

	public void sum() {
		System.out.println("- sum : " + _sum());
	}

	public void avg() {
		System.out.println("- avg : " + (_sum() / 2));
	}
}

public class CalculatorDemo {
	public static void excute(Calculator cal) {
		System.out.println("실행결과");
		cal.run();
	}

	public static void main(String[] args) {
		Calculator c1 = new CalculatorDecoPlus(10, 20);
		Calculator c2 = new CalculatorDecoMinus(20, 40);
		excute(c1);
		excute(c2);
	}
}

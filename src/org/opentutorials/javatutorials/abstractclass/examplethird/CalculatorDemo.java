package org.opentutorials.javatutorials.abstractclass.examplethird;

abstract class Calculator {
	int left, right;

	public void setOperands(int left, int right) {
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
	public void sum() {
		System.out.println("+ sum : " + _sum());
	}

	public void avg() {
		System.out.println("+ avg : " + (this.left + this.right) / 2);
	}
}

class CalculatorDecoMinus extends Calculator {
	public void sum() {
		System.out.println("- sum : " + _sum());
	}

	public void avg() {
		System.out.println("- avg : " + (this.left + this.right) / 2);
	}
}

public class CalculatorDemo {
	public static void main(String[] args) {
		CalculatorDecoPlus cFirst = new CalculatorDecoPlus();
		cFirst.setOperands(10, 20);
		cFirst.run();

		CalculatorDecoMinus cSecond = new CalculatorDecoMinus();
		cSecond.setOperands(10, 20);
		cSecond.run();
	}
}

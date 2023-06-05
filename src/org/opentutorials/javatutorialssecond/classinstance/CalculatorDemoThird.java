package org.opentutorials.javatutorialssecond.classinstance;

class CalculatorThird {
	public static void sum(int left, int right) {
		System.out.println(left + right);
	}

	public static void avg(int left, int right) {
		System.out.println((left + right) / 2);
	}
}

public class CalculatorDemoThird {
	public static void main(String[] args) {
		CalculatorThird.sum(10, 20);
		CalculatorThird.avg(10, 20);
		CalculatorThird.sum(20, 40);
		CalculatorThird.avg(20, 40);
	}
}

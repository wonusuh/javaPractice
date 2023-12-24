package org.opentutorials.javatutorialsthird.inheritance.example1;

class DivisibleCalculator extends MultiplicableCalculator {
	public void division() {
		System.out.println(this.left / this.right);
	}
}

public class CalculatorDemo3 {
	public static void main(String[] args) {
		DivisibleCalculator c1 = new DivisibleCalculator();
		c1.setOperands(100, 200);
		c1.sum();
		c1.avg();
		c1.multiplication();
		c1.division();
	}
}

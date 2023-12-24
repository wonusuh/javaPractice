package org.opentutorials.javatutorialsthird.inheritance.example1;

class MultiplicableCalculator extends Calculator2 {
	public void multiplication() {
		System.out.println(this.left * this.right);
	}
}

public class CalculatorDemo2 {
	public static void main(String[] args) {
		MultiplicableCalculator c1 = new MultiplicableCalculator();
		c1.setOperands(30, 40);
		c1.sum();
		c1.avg();
		c1.multiplication();
	}
}

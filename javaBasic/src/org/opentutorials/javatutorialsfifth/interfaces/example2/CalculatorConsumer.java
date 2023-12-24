package org.opentutorials.javatutorialsfifth.interfaces.example2;

public class CalculatorConsumer {
	public static void main(String[] args) {
		Calculator c = new Calculator();
		c.setOperands(2, 3, 4);
		System.out.println(c.sum() + c.avg());
	}
}

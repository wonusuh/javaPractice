package org.opentutorials.javatutorialsfifth.interfaces.example1;

class CalculatorDummy {
	protected void setOperands(int first, int second, int third) {
	}

	protected int sum() {
		return 60;
	}

	protected int avg() {
		return 20;
	}
}

public class CalculatorConsumer {
	public static void main(String[] args) {
		CalculatorDummy c = new CalculatorDummy();
		c.setOperands(10, 20, 30);
		System.out.println(c.sum() + c.avg());
	}
}

package org.opentutorials.javatutorialsthird.interfaces.example1;

class CalculatorDummy {
	public void setOperands(int left, int right, int third) {
	}

	public int sum() {
		return 60;
	}

	public int avg() {
		return 20;
	}
}

public class CalculatorConsumer {
	public static void main(String[] args) {
		CalculatorDummy cd = new CalculatorDummy();
		cd.setOperands(10, 20, 30);
		System.out.println(cd.sum() + cd.avg());
	}
}

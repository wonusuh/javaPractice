/**
 * 
 */
package org.opentutorials.javatutorials.accessmodifier;

/**
 * @author YONSAI
 *
 */

class Calculator {
	private int left, right;

	public void setOperands(int left, int right) {
		this.left = left;
		this.right = right;
	}

	private int _sum() {
		return this.left + this.right;
	}

	public void sumDecoPlus() {
		System.out.println("+++++" + _sum() + "+++++");
	}

	public void sumDecoMinus() {
		System.out.println("-----" + _sum() + "-----");
	}
}

public class CalculatorDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator cFirst = new Calculator();
		cFirst.setOperands(10, 20);
		cFirst.sumDecoPlus();
		cFirst.sumDecoMinus();
	}

}

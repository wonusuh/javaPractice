/**
 * 
 */
package org.opentutorials.javatutorials.inheritance.examplefirst;

/**
 * @author YONSAI
 *
 */

class CalculatorTemporary {
	int left, right;

	public void setOperands(int left, int right) {
		this.left = left;
		this.right = right;
	}

	public void sum() {
		System.out.println(this.left + this.right);
	}

	public void average() {
		System.out.println((this.left + this.right) / 2);
	}
}

public class CalculatorDemoFourth {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalculatorTemporary cFirst = new CalculatorTemporary();
		cFirst.setOperands(10, 20);
		cFirst.sum();
		cFirst.average();

		CalculatorTemporary cSecond = new CalculatorTemporary();
		cSecond.setOperands(20, 40);
		cSecond.sum();
		cSecond.average();

	}

}

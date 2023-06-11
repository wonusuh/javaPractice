/**
 * 
 */
package org.opentutorials.javatutorialssecond.interfaces.example1;

/**
 * @author user
 *
 */
class Calculator {
	int left, right;

	public void setOperands(int left, int right) {
		this.left = left;
		this.right = right;
	}

	public void sum() {
		System.out.println(this.left + this.right);
	}

	public void avg() {
		System.out.println((this.left + this.right) / 2);
	}
}

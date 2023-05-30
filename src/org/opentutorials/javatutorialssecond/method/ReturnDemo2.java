/**
 * 
 */
package org.opentutorials.javatutorialssecond.method;

/**
 * @author user
 *
 */
public class ReturnDemo2 {
	/**
	 * @param args
	 */
	public static String num(int i) {
		if (i == 0) {
			return "zero";
		} else if (i == 1) {
			return "one";
		} else if (i == 2) {
			return "two";
		} else {
			return "none";
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(num(0));
		System.out.println(num(1));
		System.out.println(num(2));
		System.out.println(num(3));
	}
}

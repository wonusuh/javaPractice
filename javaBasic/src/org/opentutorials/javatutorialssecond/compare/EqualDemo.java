/**
 * 
 */
package org.opentutorials.javatutorialssecond.compare;

/**
 * @author user
 *
 */
public class EqualDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(1 == 2); // false
		System.out.println(1 == 1); // true
		System.out.println("one" == "two"); // false
		System.out.println("one" == "one"); // true

		System.out.println(1 != 2); // true
		System.out.println(1 != 1); // false
		System.out.println("one" != "two"); // true
		System.out.println("one" != "one"); // false

	}

}

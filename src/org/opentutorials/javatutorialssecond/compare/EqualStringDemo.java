/**
 * 
 */
package org.opentutorials.javatutorialssecond.compare;

/**
 * @author user
 *
 */
public class EqualStringDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a = "Hello world";
		String b = new String("Hello world");
		System.out.println(a == b); // false
		System.out.println(a.equals(b)); // true

	}

}

/**
 *
 */
package org.opentutorials.javatutorialssecond.loop;

/**
 * @author user
 *
 */
public class ContinueDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 0; i < 10; i++) {
			if (i == 5) {
				continue;
			}
			System.out.println("Coding everyday" + i);
		}

	}

}

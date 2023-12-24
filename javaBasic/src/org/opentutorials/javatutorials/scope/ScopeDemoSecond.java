/**
 * 
 */
package org.opentutorials.javatutorials.scope;

/**
 * @author YONSAI
 *
 */
public class ScopeDemoSecond {

	/**
	 * @param args
	 */

	static int i; // global variable

	static void a() {
		i = 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (i = 0; i < 5; i++) {
			a();
			System.out.println(i);
		}

	}

}

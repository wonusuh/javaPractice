/**
 * 
 */
package org.opentutorials.javatutorials.scope;

/**
 * @author YONSAI
 *
 */
class ScopeDemo {

	/**
	 * @param args
	 */

	static void a() {
		int i = 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 435;
		int b = 398;
		int c = 358;

		for (int j = 1; j <= 100; j++) {
			System.out.println((a + b + c) * j);
		}

	}

}

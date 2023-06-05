/**
 * 
 */
package org.opentutorials.javatutorialssecond.scope;

/**
 * @author user
 *
 */
public class ScopeDemo {

	/**
	 * @param args
	 */
	static void a() {
		int i = 0; // local variable
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 5; i++) {
			a();
			System.out.println(i);
		}
	}

}

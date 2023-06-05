/**
 * 
 */
package org.opentutorials.javatutorials.scope;

/**
 * @author YONSAI
 *
 */
public class ScopeDemoSixth {
	/**
	 * @param args
	 */
	static int i = 5;

	static void a() {
		int i = 10;
		b();
	}

	static void b() {
		// int i = 30; // local variable
		System.out.println(i);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		a();
	}
}

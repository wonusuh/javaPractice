/**
 * 
 */
package org.opentutorials.javatutorials.scope;

/**
 * @author YONSAI
 *
 */

class C {
	int v = 10;

	void m() {
		int v = 20;
		System.out.println(v);
		System.out.println(this.v);
	}
}

public class ScopeDemoSeventh {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C cFirst = new C();
		cFirst.m();

	}

}

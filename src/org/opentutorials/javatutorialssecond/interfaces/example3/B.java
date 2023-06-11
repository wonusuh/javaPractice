/**
 * 
 */
package org.opentutorials.javatutorialssecond.interfaces.example3;

/**
 * @author user
 *
 */
interface I3 {
	public void x();
}

interface I4 extends I3 {
	public void z();
}

class B implements I4 {
	public void x() {
	}

	public void z() {
	}
}

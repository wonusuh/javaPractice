/**
 * 
 */
package org.opentutorials.javatutorialssecond.interfaces.example3;

/**
 * @author user
 *
 */
interface I1 {
	public void x();
}

interface I2 {
	public void z();
}

class A implements I1, I2 {
	public void x() {
	}

	public void z() {
	}
}

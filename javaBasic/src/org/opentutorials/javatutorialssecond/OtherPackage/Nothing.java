/**
 * 
 */
package org.opentutorials.javatutorialssecond.OtherPackage;

/**
 * @author user
 *
 */

public class Nothing {
	public void _public() {
		System.out.println("public");
	}

	protected void _protected() {
		System.out.println("protected");
	}

	void _default() {
		System.out.println("default");
	}

	private void _private() {
		System.out.println("private");
	}
}

class OtherPackageChecker extends Other {
	public OtherPackageChecker() {
		Nothing nothing = new Nothing();
		nothing._public();
		nothing._protected();
		nothing._default();
//		nothing._private();
	}
}

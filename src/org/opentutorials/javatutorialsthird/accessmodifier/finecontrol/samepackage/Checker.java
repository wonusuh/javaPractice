package org.opentutorials.javatutorialsthird.accessmodifier.finecontrol.samepackage;

import org.opentutorials.javatutorialsthird.accessmodifier.finecontrol.otherpackage.*;

class SameClassChecker {
	public SameClassChecker() {
		this._public();
		this._protected();
		this._default();
		this._private();
	}

	private void _private() {
		System.out.println("private");
	}

	void _default() {
		System.out.println("default");
	}

	protected void _protected() {
		System.out.println("protected");
	}

	public void _public() {
		System.out.println("public");
	}
}

class SamePackageChecker extends Same {
	public SamePackageChecker() {
		Same same = new Same();
		same._public();
		same._protected();
		same._default();
//		same._private();

		this._public();
		this._protected();
		this._default();
//		this._private();
	}
}

class OtherPackageChecker extends Other {
	public OtherPackageChecker() {
		Other other = new Other();
		other._public();
//		other._protected();
//		other._default();
//		other._privare();

		this._public();
		this._protected();
//		this._default();
//		this._private();

		Nothing nothing = new Nothing();
		nothing._public();
//		nothing._protected();
//		nothing._default();
//		nothing._privare();
	}
}

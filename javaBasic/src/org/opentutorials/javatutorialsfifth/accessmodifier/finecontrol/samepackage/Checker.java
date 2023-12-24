package org.opentutorials.javatutorialsfifth.accessmodifier.finecontrol.samepackage;

import org.opentutorials.javatutorialsfifth.accessmodifier.finecontrol.otherpackage.*;

class SameClassChecker {
	SameClassChecker() {
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
	SamePackageChecker() {
		Same same = new Same();
		// same._private();
		same._default();
		same._protected();
		same._public();

		// 같은 패키지 상속 관계
		// this._private
		this._default();
		this._protected();
		this._public();
	}
}

class OtherPackageChecker extends Other {
	OtherPackageChecker() {
		Other other = new Other();
		// other._private();
		// other._default();
		// other._protected();
		other._public();

		// this._private();
		// this._default();
		this._protected();
		this._public();

		Nothing nothing = new Nothing();
		nothing._public();
		// nothing._protected();
		// nothing._default();
		// nothing._private();
	}
}

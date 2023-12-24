package org.opentutorials.javatutorialsfourth.accessmodifier.finecontrol.samepackage;

import org.opentutorials.javatutorialsfourth.accessmodifier.finecontrol.otherpackage.*;

class SameClassChecker {
	public SameClassChecker() {
		// 같은 클래스
		this._private();
		this._default();
		this._protected();
		this._public();
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
		// 같은 패키지
		Same same = new Same();
		// same._private();
		same._default();
		same._protected();
		same._public();

		// 같은 패키지 상속 관계
		// this._private();
		this._default();
		this._protected();
		this._public();
	}
}

class OtherPackageChecker extends Other {
	public OtherPackageChecker() {
		// 다른 패키지
		Other other = new Other();
		// other._private();
		// other._default();
		// other._protected();
		other._public();

		// 다른 패키지, 서브 클래스
		// this._private();
		// this._default();
		this._protected();
		this._public();

		Nothing nothing = new Nothing();
		// nothing._private();
		// nothing._default();
		// nothing._protected();
		nothing._public();
	}
}

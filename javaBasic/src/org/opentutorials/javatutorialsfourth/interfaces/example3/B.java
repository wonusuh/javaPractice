package org.opentutorials.javatutorialsfourth.interfaces.example3;

interface I3 {
	public void x();
}

interface I4 extends I3 {
	public void z();
}

class B implements I4 {
	@Override
	public void x() {
	}

	@Override
	public void z() {
	}
}

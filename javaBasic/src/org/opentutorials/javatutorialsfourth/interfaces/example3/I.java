package org.opentutorials.javatutorialsfourth.interfaces.example3;

interface I {
	public void x();
}

interface I2 {
	public void z();
}

class A implements I, I2 {
	@Override
	public void z() {
	}

	@Override
	public void x() {
	}
}

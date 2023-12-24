package org.opentutorials.javatutorialsfifth.interfaces.example3;

interface I1 {
	public void x();
}

interface I2 {
	public void z();
}

public class A implements I1, I2 {
	@Override
	public void z() {
	}

	@Override
	public void x() {
	}
}

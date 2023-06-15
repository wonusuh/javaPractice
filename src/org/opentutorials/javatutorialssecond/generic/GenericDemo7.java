package org.opentutorials.javatutorialssecond.generic;

abstract class Info {
	public abstract int getLevle();
}

class EmployeeInfo7 extends Info {
	public int rank;

	EmployeeInfo7(int rank) {
		this.rank = rank;
	}

	public int getLevle() {
		return this.rank;
	}
}

public class GenericDemo7 {
	public static void main(String[] args) {
	}
}
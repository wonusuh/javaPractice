package org.opentutorials.javatutorialssecond.generic;

interface Info8 {
	int getLevel();
}

class EmployeeInfo8 implements Info8 {
	public int rank;

	EmployeeInfo8(int rank) {
		this.rank = rank;
	}

	public int getLevel() {
		return this.rank;
	}
}

class Person8<T extends Info8> {
	public T info;

	Person8(T info) {
		this.info = info;
	}
}

public class GenericDemo8 {
	public static void main(String[] args) {
		Person8<EmployeeInfo8> p1 = new Person8<EmployeeInfo8>(new EmployeeInfo8(13));
		// Person8<String> p2 = new Person8<String>("부장");
	}
}

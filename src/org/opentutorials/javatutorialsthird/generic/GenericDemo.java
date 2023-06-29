package org.opentutorials.javatutorialsthird.generic;

interface Info {
	public abstract int getLevel();
}

class EmployeeInfo implements Info {
	public int rank;

	EmployeeInfo(int rank) {
		this.rank = rank;
	}

	public int getLevel() {
		return this.rank;
	}
}

class Person<T extends Info> {
	public T info;

	Person(T info) {
		this.info = info;
	}
}

public class GenericDemo {
	public static void main(String[] args) {
		Person p1 = new Person(new EmployeeInfo(1));
	}
}

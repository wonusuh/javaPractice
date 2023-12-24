package org.opentutorials.javatutorialsfifth.generic;

interface Info {
	public abstract int getLevel();
}

class EmployeeInfo implements Info {
	protected int rank;

	protected EmployeeInfo(int rank) {
		this.rank = rank;
	}

	@Override
	public int getLevel() {
		return this.rank;
	}
}

class Person<T extends Info> {
	protected T info;

	protected Person(T info) {
		this.info = info;
	}
}

public class GenericDemo {
	public static void main(String[] args) {
		Person p1 = new Person(new EmployeeInfo(23));
		p1.info.getLevel();
		// Person<String> p2 = new Person<String>("∫Œ¿Â");
	}
}

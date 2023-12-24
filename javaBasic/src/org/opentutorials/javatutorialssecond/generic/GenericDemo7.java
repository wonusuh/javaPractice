package org.opentutorials.javatutorialssecond.generic;

abstract class Info {
	public abstract int getLevel();
}

class EmployeeInfo7 extends Info {
	public int rank;

	EmployeeInfo7(int rank) {
		this.rank = rank;
		System.out.println(rank);
	}

	public int getLevel() {
		return this.rank;
	}
}

class Person7<T extends Info> {
	public T info;

	Person7(T info) {
		this.info = info;
		System.out.println(info);
	}
}

public class GenericDemo7 {
	public static void main(String[] args) {
		Person7<EmployeeInfo7> p1 = new Person7<EmployeeInfo7>(new EmployeeInfo7(11));
		// Person7<String> p2 = new Person7<String>("부장");
	}
}

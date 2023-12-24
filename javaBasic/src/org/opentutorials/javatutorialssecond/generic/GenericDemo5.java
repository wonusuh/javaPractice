package org.opentutorials.javatutorialssecond.generic;

class EmployeeInfo5 {
	public int rank;

	EmployeeInfo5(int rank) {
		this.rank = rank;
	}
}

class Person5<T, S> {
	public T info;
	public S id;

	Person5(T info, S id) {
		this.info = info;
		this.id = id;
	}
}

public class GenericDemo5 {
	public static void main(String[] args) {
		EmployeeInfo5 e = new EmployeeInfo5(7);
		Integer i = new Integer(8);
		Person5 p1 = new Person5(e, i);
		System.out.println(((Integer) p1.id).intValue());
	}
}

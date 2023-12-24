package org.opentutorials.javatutorialssecond.generic;

class EmployeeInfo6 {
	public int rank;

	EmployeeInfo6(int rank) {
		this.rank = rank;
	}
}

class Person6<T, S> {
	public T info;
	public S id;

	Person6(T info, S id) {
		this.info = info;
		this.id = id;
	}

	public <U> void printInfo(U info) {
		System.out.println(info);
	}
}

public class GenericDemo6 {
	public static void main(String[] args) {
		EmployeeInfo6 e = new EmployeeInfo6(9);
		Integer i = new Integer(10);
		Person6<EmployeeInfo6, Integer> p1 = new Person6<EmployeeInfo6, Integer>(e, i);
		p1.<EmployeeInfo6>printInfo(e);
		p1.printInfo(e);
	}
}

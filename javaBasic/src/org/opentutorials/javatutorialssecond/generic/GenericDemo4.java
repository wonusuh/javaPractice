package org.opentutorials.javatutorialssecond.generic;

class EmployeeInfo4 {
	public int rank;

	EmployeeInfo4(int rank) {
		this.rank = rank;
	}
}

class Person4<T, S> {
	public T info;
	public S id;

	Person4(T info, S id) {
		this.info = info;
		this.id = id;
	}
}

public class GenericDemo4 {
	public static void main(String[] args) {
		EmployeeInfo4 e = new EmployeeInfo4(5);
		Integer i = new Integer(6);
		Person4<EmployeeInfo4, Integer> p1 = new Person4<EmployeeInfo4, Integer>(e, i);
		System.out.println(p1.id.intValue());
	}
}

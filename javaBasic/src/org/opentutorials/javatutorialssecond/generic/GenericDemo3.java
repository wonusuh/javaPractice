package org.opentutorials.javatutorialssecond.generic;

class StudentInfo3 {
	public int grade;

	StudentInfo3(int grade) {
		this.grade = grade;
	}
}

class EmployeeInfo3 {
	public int rank;

	EmployeeInfo3(int rank) {
		this.rank = rank;
	}
}

class Person3 {
	public Object info;

	Person3(Object info) {
		this.info = info;
	}
}

public class GenericDemo3 {
	public static void main(String[] args) {
		Person3 p1 = new Person3("부장");
		EmployeeInfo3 ei = (EmployeeInfo3) p1.info;
		System.out.println(ei.rank);
	}
}

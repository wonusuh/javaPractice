package org.opentutorials.javatutorialssecond.generic;

class StudentInfo {
	public int grade;

	StudentInfo(int grade) {
		this.grade = grade;
	}
}

class StudentPerson {
	public StudentInfo info;

	StudentPerson(StudentInfo info) {
		this.info = info;
	}
}

class EmployeeInfo {
	public int rank;

	EmployeeInfo(int rank) {
		this.rank = rank;
	}
}

class EmployeePerson {
	public EmployeeInfo info;

	EmployeePerson(EmployeeInfo info) {
		this.info = info;
	}
}

public class GenericDemo2 {
	public static void main(String[] args) {
		StudentInfo si = new StudentInfo(1);
		StudentPerson sp = new StudentPerson(si);
		System.out.println(si);
		System.out.println(sp);
		System.out.println(sp.info);
		System.out.println(sp.info.grade);

		EmployeeInfo ei = new EmployeeInfo(2);
		EmployeePerson ep = new EmployeePerson(ei);
		System.out.println(ei);
		System.out.println(ep);
		System.out.println(ep.info);
		System.out.println(ep.info.rank);
	}
}

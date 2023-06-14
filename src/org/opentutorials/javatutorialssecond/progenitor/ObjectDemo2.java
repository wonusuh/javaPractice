package org.opentutorials.javatutorialssecond.progenitor;

class StudentSecond implements Cloneable {
	String name;

	StudentSecond(String name) {
		this.name = name;
	}

	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}

class ObjectDemo2 {
	public static void main(String[] args) {
		StudentSecond s1 = new StudentSecond("egoing");
		try {
			StudentSecond s2 = (StudentSecond) s1.clone();
			System.out.println(s1.name);
			System.out.println(s2.name);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
}

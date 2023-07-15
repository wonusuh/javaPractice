package org.opentutorials.javatutorialsfourth.progenitor;

import java.util.Objects;

class Student implements Cloneable {
	String name;

	Student(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(name, other.name);
	}

	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}

public class ObjectDemo {
	public static void main(String[] args) {
		Student s1 = new Student("Yubin");
		try {
			Student s2 = (Student) s1.clone();
			System.out.println(s1.name);
			System.out.println(s2.name);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
}

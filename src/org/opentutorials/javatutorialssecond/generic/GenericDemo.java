package org.opentutorials.javatutorialssecond.generic;

class Person<T> {
}

public class GenericDemo {
	public static void main(String[] args) {
		Person<String> p1 = new Person<String>();
		Person<StringBuilder> p2 = new Person<StringBuilder>();
	}
}

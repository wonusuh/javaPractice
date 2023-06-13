package org.opentutorials.javatutorialssecond.exception;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class B {
	void runB() {
		BufferedReader bReader = null;
		String input = null;
		try {
			bReader = new BufferedReader(new FileReader("out.txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			input = bReader.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(input);
	}
}

class C {
	void runC() {
		B b = new B();
		b.runB();
	}
}

public class ThrowExceptionDemo {
	public static void main(String[] args) {
		C c = new C();
		c.runC();
	}
}

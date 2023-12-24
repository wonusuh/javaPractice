package org.opentutorials.javatutorialsfourth.exception;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class B {
	void run() throws FileNotFoundException, IOException {
		BufferedReader bReader = null;
		bReader = new BufferedReader(new FileReader("out.txt"));
		String input = null;
		input = bReader.readLine();
		System.out.println(input);
	}
}

class C {
	void run() throws FileNotFoundException, IOException {
		B b = new B();
		b.run();
	}
}

public class ThrowExceptionDemo {
	public static void main(String[] args) {
		C c = new C();
		try {
			c.run();
		} catch (FileNotFoundException e) {
			System.out.println("The file out.txt is a system file. It must exist in root directory of the project.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

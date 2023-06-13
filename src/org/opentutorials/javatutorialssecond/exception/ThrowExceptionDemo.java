package org.opentutorials.javatutorialssecond.exception;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class B {
	void runB() throws FileNotFoundException, IOException {
		BufferedReader bReader = null;
		String input = null;
		bReader = new BufferedReader(new FileReader("out.txt"));
		bReader.close();
		input = bReader.readLine();
		System.out.println(input);
	}
}

class C {
	void runC() throws FileNotFoundException, IOException {
		B b = new B();
		b.runB();
	}
}

public class ThrowExceptionDemo {
	public static void main(String[] args) {
		C c = new C();
		try {
			c.runC();
		} catch (FileNotFoundException e) {
			System.out.println("out.txt 파일은 설정 파일입니다. 이 파일이 프로젝트 루트 디렉터리에 존재해야 합니다.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

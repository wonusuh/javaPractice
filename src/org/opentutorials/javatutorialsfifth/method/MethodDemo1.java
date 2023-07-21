package org.opentutorials.javatutorialsfifth.method;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class MethodDemo1 {
	public static String numbering(int init, int limit) {
		String output = "";
		for (int i = init; i < limit; i++) {
			output += i;
		}
		return output;
	}

	public static void main(String[] args) {
		String result = numbering(10, 50);
		System.out.println(result);
		try {
			BufferedWriter out = new BufferedWriter(new FileWriter("out.txt"));
			out.write(result);
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

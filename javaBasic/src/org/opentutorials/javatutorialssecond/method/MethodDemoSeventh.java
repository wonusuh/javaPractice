package org.opentutorials.javatutorialssecond.method;

import java.io.*;

public class MethodDemoSeventh {
	public static String numbering(int init, int limit) {
		String output = "";
		for (int i = init; i < limit; i++) {
			output += i;
		}
		return output;
	}

	public static void main(String[] args) {
		String result = numbering(1, 5);
		System.out.println(result);
		try {
			BufferedWriter out = new BufferedWriter(new FileWriter("out.txt"));
			out.write(result);
			out.close();
		} catch (IOException e) {
		}
	}
}

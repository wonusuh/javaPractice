package org.opentutorials.javatutorialsfourth.method;

import java.io.*;

public class MethodDemo6 {
	public static String numbering(int init, int limit) {
		String output = "";
		for (int i = init; i < limit; i++) {
			output = output + i;
		}
		return output;
	}

	public static void main(String[] args) {
		String result = numbering(5, 10);
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

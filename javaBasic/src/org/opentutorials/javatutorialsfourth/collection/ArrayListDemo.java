package org.opentutorials.javatutorialsfourth.collection;

import java.util.ArrayList;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("one");
		al.add("two");
		al.add("three");
		for (int i = 0; i < al.size(); i++) {
			String val = al.get(i);
			System.out.println(val);
		}
	}
}

package org.opentutorials.javatutorialsfifth.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

class Computer implements Comparable<Object> {
	protected int serial;
	protected String owner;

	protected Computer(int serial, String owner) {
		this.serial = serial;
		this.owner = owner;
	}

	@Override
	public int compareTo(Object o) {
		return this.serial - ((Computer) o).serial;
	}

	public String toString() {
		return serial + " " + owner;
	}
}

public class CollectionsDemo {
	public static void main(String[] args) {
		List<Computer> computers = new ArrayList<Computer>();
		computers.add(new Computer(3233, "그래파이트"));
		computers.add(new Computer(200, "리체"));
		computers.add(new Computer(500, "이고잉"));
		Iterator<Computer> i = computers.iterator();
		System.out.println("before sorting : ");
		while (i.hasNext()) {
			System.out.println(i.next());
		}
		Collections.sort(computers);
		i = computers.iterator();
		System.out.println("\nafter sorting : ");
		while (i.hasNext()) {
			System.out.println(i.next());
		}
	}
}

package org.opentutorials.javatutorialsthird.polymorphism;

interface father {
}

interface mother {
}

interface beliver {
}

interface programmer {
	public void coding();
}

class Steve implements father, programmer, beliver {
	public void coding() {
		System.out.println("coding fast");
	}
}

class Rachel implements mother, programmer {
	public void coding() {
		System.out.println("coding elegance");
	}
}

public class Workspace {
	public static void main(String[] args) {
		programmer employee1 = new Steve();
		programmer employee2 = new Rachel();
		employee1.coding();
		employee2.coding();
	}
}

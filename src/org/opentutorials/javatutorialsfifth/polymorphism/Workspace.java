package org.opentutorials.javatutorialsfifth.polymorphism;

interface father {
}

interface mother {
}

interface programmer {
	public void coding();
}

interface beliver {
}

class Steve implements father, programmer, beliver {
	@Override
	public void coding() {
		System.out.println("coding fast");
	}
}

class Rachel implements mother, programmer {
	@Override
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

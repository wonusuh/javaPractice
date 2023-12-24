/**
 * 
 */
package org.opentutorials.javatutorialssecond.polymorphism;

/**
 * @author user
 *
 */
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
	public void coding() {
		System.out.println("fast");
	}
}

class Rachel implements mother, programmer {
	public void coding() {
		System.out.println("elegance");
	}
}

public class Workspace {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		programmer employee1 = new Steve();
		programmer employee2 = new Rachel();

		employee1.coding();
		employee2.coding();
	}
}

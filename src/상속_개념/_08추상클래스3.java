package 상속_개념;

abstract class Shape {
	String name, color;
	double size; // 1 ~ 10

	/**
	 * @param name
	 * @param color
	 * @param size
	 */
	protected Shape(String name, String color, double size) {
		super();
		this.name = name;
		this.color = color;
		this.size = size;
	}

	abstract void draw();
}

class Line extends Shape {
	protected Line(String name, String color, double size) {
		super(name, color, size);
	}

	@Override
	void draw() {
		System.out.println("선을 긋는다.");
	}
}

class Circle extends Shape {
	public int radius;

	/**
	 * @param name
	 * @param color
	 * @param size
	 * @param radius
	 */
	protected Circle(String name, String color, double size, int radius) {
		super(name, color, size);
		this.radius = radius;
	}

	@Override
	void draw() {
		System.out.println("원을 그린다.");
	}
}

class Point extends Shape {
	protected Point(String name, String color, double size) {
		super(name, color, size);
	}

	@Override
	void draw() {
		System.out.println("점을 찍는다.");
	}
}

class Rect extends Shape {
	int height, width;

	/**
	 * @param name
	 * @param color
	 * @param size
	 * @param height
	 * @param width
	 */
	protected Rect(String name, String color, double size, int height, int width) {
		super(name, color, size);
		this.height = height;
		this.width = width;
	}

	@Override
	void draw() {
		System.out.println("사각형을 그린다.");
	}
}

class Triangle extends Shape {
	int height, width;

	/**
	 * @param name
	 * @param color
	 * @param size
	 * @param height
	 * @param width
	 */
	protected Triangle(String name, String color, double size, int height, int width) {
		super(name, color, size);
		this.height = height;
		this.width = width;
	}

	@Override
	void draw() {
		System.out.println("삼각형을 그린다.");
	}
}

public class _08추상클래스3 {
	public static void main(String[] args) { // 도형 10개를 출력하세요.
//		String[] color = { "" };
//		Shape[] list = new Shape[10];
	}
}

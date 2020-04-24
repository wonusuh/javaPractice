package secondJumpToJava;

public class TestNumber {
	public static void main(String[] args) {
		int age = 10;
		long countOfStars = 8764827384923849L;
		float pi = 3.14F;
		double morePi = 3.140123456789;
		double d1 = 123.4;
		double d2 = 1234e2;
		int octal = 023;
		int hex = 0xC;
		System.out.println(age * countOfStars);
		System.out.println(pi * morePi);
		System.out.println(d1 * d2);
		System.out.println(octal * hex);

		int i = 0;
		int j = 10;
		i++;
		j--;
		System.out.println("i = " + i);
		System.out.println("j = " + j);

		int k = 0;
		System.out.println("k = " + k++);
		System.out.println("k = " + k);

		int l = 0;
		System.out.println("l = " + ++l);
		System.out.println("l = " + l);
	}
}

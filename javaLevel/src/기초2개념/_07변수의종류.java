package 기초2개념;

public class _07변수의종류 {
	public static void main(String[] args) {
		// int 4byte, long 8byte
		int a = 10;
		System.out.println(a);
		long b = 1000000000000000000L;
		System.out.println(b);

		// double(8byte), float(4byte)
		float c = 1.234F;
		System.out.println(c);
		double d = 1.234;
		System.out.println(d);

		char e = 'a';
		System.out.println(e);
		String f = "박연미";
		System.out.println(f);

		boolean g = true;
		System.out.println(g);
		boolean h = false;
		System.out.println(h);
	}
}

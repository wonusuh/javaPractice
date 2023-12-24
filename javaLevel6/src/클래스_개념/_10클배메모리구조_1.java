package 클래스_개념;

class AA {
	int a, b;
}

public class _10클배메모리구조_1 {

	public static void main(String[] args) {

		AA aa = new AA();
		aa.a = 10;
		System.out.println(aa);
		aa = new AA();
		aa.b = 20;
		System.out.println(aa);

		System.out.println(aa.a);
		System.out.println(aa.b);
	}
}

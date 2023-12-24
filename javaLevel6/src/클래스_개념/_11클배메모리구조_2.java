package 클래스_개념;

import java.util.Arrays;

class BB {
	int a, b;
}

public class _11클배메모리구조_2 {

	public static void main(String[] args) {

		BB[] bb = new BB[3];
		System.out.println(bb);

		for (int i = 0; i < bb.length; i += 1) {

			bb[i] = new BB();

			bb[i].a = 10;
			bb[i].b = 20;
			System.out.println(Arrays.deepToString(bb));
		}
	}
}

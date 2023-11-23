package 클래스_개념;

class EE {
	int[] arr = { 1, 2, 3 };
}

public class _14클배메모리구조_5 {

	public static void main(String[] args) {

		EE[] ee = new EE[3];

		for (int i = 0; i < ee.length; i += 1) {
			ee[i] = new EE();
		}

		EE test1 = new EE();
		int[] arr = { 4, 5, 6 };

		test1.arr = arr;

		ee[1] = test1;

		arr[1] = 100;
	}
}

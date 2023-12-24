package 클래스_개념;

class Sample02 {
	int[] arr = { 10, 20, 30, 40, 50 };
}

public class _04클래스메모리구조_2 {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };

		Sample02 s4 = new Sample02();

		Sample02 temp = s4;
		s4 = null;

		temp.arr = arr;

		System.out.println(temp);
		System.out.println(s4);
	}
}

package 메서드_개념;

import java.util.Arrays;

class Test08 {
	// 리턴 있는 클래스

	int getFours(int[] arr) {

		int cnt = 0;

		for (int i : arr) {

			if (i % 4 == 0) {
				cnt += 1;
			}
		}
		return cnt;
	}

	int[] getFoursArr(int[] arr) {

		int cnt = 0;
		for (int i : arr) {

			if (i % 4 == 0) {
				cnt += 1;
			}
		}

		int[] temp = new int[cnt];
		int idx = 0;
		for (int i = 0; i < arr.length; i += 1) {

			if (arr[i] % 4 == 0) {
				temp[idx] = arr[i];
				idx += 1;
			}
		}

		return temp;
	}
}

class Test09 {
	// 리턴 없는 클래스

	int cnt;
	int[] arr;

	void getFours(int[] arr) {

		for (int i : arr) {

			if (i % 4 == 0) {
				this.cnt += 1;
			}
		}
	}

	void getFoursArr(int[] arr) {

		int cnt = 0;
		for (int i : arr) {

			if (i % 4 == 0) {
				cnt += 1;
			}
		}

		this.arr = new int[cnt];
		int idx = 0;
		for (int i = 0; i < arr.length; i += 1) {

			if (arr[i] % 4 == 0) {
				this.arr[idx++] = arr[i];
			}
		}
	}
}
// 리턴을 사용하는 이유
//1. 리턴을 사용하면 인스턴스변수를 한 개 줄일 수 있음.

public class _12메서드기본이론7 {

	public static void main(String[] args) {

		Test08 e8 = new Test08();
		Test09 e9 = new Test09();

		int[] arr = { 97, 12, 21, 56, 100 };

		System.out.println("[리턴 사용 할 경우]");
//		문제1 4의배수의 개수를 리턴해주는 메서드
		int cnt1 = e8.getFours(arr);
		System.out.println(cnt1);

//		문제2 4의배수만 배열 타입으로 리턴해주는메서드
		int[] arr1 = e8.getFoursArr(arr);
		System.out.println(Arrays.toString(arr1));

		System.out.println("----------------------");

		System.out.println("[리턴 사용 안할 경우]");

//		문제1 4의배수의 개수를 리턴해주는 메서드
		e9.getFours(arr);
		System.out.println(e9.cnt);

//		문제2 4의배수만 배열 타입으로 리턴해주는메서드
		e9.getFoursArr(arr);
		System.out.println(Arrays.toString(e9.arr));
	}
}

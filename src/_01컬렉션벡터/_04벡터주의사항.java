package _01컬렉션벡터;

import java.util.Vector;

public class _04벡터주의사항 {

	public static void main(String[] args) {

		int[] arr = { 1, 1, 3, 2, 2, 3, 3, 4, 4, 5, 5, 4 };
		Vector<Integer> list = new Vector<Integer>();

		for (int num : arr) {
			list.add(num);
		}

		for (int i = 0; i < arr.length; i += 1) {

			if (arr[i] == 3) {

				for (int j = i; j < arr.length - 1; j += 1) {
					arr[j] = arr[j + 1];
					arr[j + 1] = 0;
				}
				i -= 1;
			}
		}

		for (int num : arr) {
			System.out.print(num + " ");
		}
	}
}

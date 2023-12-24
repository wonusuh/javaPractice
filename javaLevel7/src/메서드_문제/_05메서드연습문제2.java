package 메서드_문제;

import java.util.Arrays;

class Return1 {

	int[] getResult(String[] data) {

		int[] arr = new int[data.length];
		int cnt = 0;

		for (int i = 0; i < data.length; i += 1) {

			if (Integer.parseInt(data[i]) >= 60) {
				arr[cnt] = Integer.parseInt(data[i]);
				cnt += 1;
			}
		}

		// 깊은 복사
		int[] copy = arr;
		arr = new int[cnt];

		for (int i = 0; i < cnt; i += 1) {
			arr[i] = copy[i];
		}
		copy = null;
		return arr;
	}
}

public class _05메서드연습문제2 {
	public static void main(String[] args) {
//		문제
//		main 메서드 안에 data배열은 학생점수를 문자열 타입으로 저장한 것이다.
//		점수는 0~100점 사이이고, 60점 이상이면 합격생이다.
//		오로지 합격생의 점수만 result 배열에 담아서 return하는
//		run메서드를 구현하시오.

		Return1 re = new Return1();

		String[] data = { "34", "43", "76", "12", "64" };
		int[] result = null; // re.getResult(data);

		// result 출력 : 76, 64
		result = re.getResult(data);
		System.out.println(Arrays.toString(result));
	}
}

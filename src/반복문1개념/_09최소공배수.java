package 반복문1개념;

public class _09최소공배수 {
	public static void main(String[] args) {
		// 문제
//		 8과 12의 최소공배수를 구하시오
		// 최소공배수랑, 각 수의 배수를 나열한 다음 처음으로 같은 숫자를 의미한다
//		예
//			8, 16, 24, 12, 24
//		 정답 24
		int i = 1;
		int cnt = 0;

		boolean run = true;
		while (run) {
			if (i % 8 == 0 && i % 12 == 0) {
				cnt += 1;
				System.out.println(i);
				if (cnt >= 1) {
					run = false;
				}
			}
			i += 1;
		}
	}
}

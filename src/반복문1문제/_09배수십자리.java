package 반복문1문제;

public class _09배수십자리 {
	public static void main(String[] args) {
//		문제
//			숫자 100이상 900 이하인 9의 배수중에서
//			10의자리가 6인 첫 번째 배수를 출력하시오
//		정답
//			162
		int i = 100;
		int answer = 0;
		int cnt = 0;

		while (i <= 900) {
			System.out.println("9의 배수 : " + i);
			if (i % 9 == 0 && i % 100 / 10 == 6 && cnt == 0) {
				cnt += 1;
				answer = i;

			}
			i += 1;
		}
		System.out.println(answer);
	}
}

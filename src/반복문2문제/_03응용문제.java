package 반복문2문제;

public class _03응용문제 {
	public static void main(String[] args) {
//		문제1) 50에서 100까지의 자연수중에 9의배수의 갯수를 출력하라
		// 정답 6
//		문제2) 28의 배수중에서 가장 큰 세 자리수를 출력
//			답 980
//		문제3) 8의 배수를 작은 수부터 5개 출력

		// 문제1)
		int i = 50;
		int cnt = 0;

		while (i <= 100) {
			if (i % 9 == 0) {
				System.out.print(i + " ");
				cnt += 1;
			}
			i += 1;
		}
		System.out.println("(9의 배수의 갯수 : " + cnt + ")");

		// 문제2)
		i = 28;
		int max = 0;

		while (true) {
			max += i;
			if (max > 1000) {
				max -= 28;
				break;
			}
			i += 28;
		}
		System.out.println("가장 큰 세자리 수 : " + max);

		// 문제3
		i = 0;
		cnt = 0;

		while (true) {
			if (i % 8 == 0) {
				cnt += 1;
				System.out.print(i + " ");
				if (cnt == 5) {
					break;
				}
			}
			i += 8;
		}
	}
}

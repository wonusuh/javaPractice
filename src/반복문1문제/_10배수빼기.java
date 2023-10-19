package 반복문1문제;

public class _10배수빼기 {
	public static void main(String[] args) {
//		문제
//			다음 조건이 전부 맞는 수를 출력하시오
//			조건1) 13이상 100미만의 숫자중에서 13의 배수를 전부 검사한다
//			조건2) 그 중 6번째 배수에서 4번째 배수를 뺀 수를 구한다
//		정답
//			26

		int i = 13;
		int cnt = 0;
		int fourth = 0;
		int sixth = 0;

		while (i < 100) {
			if (i % 13 == 0) {
				if (cnt == 4) {
					fourth = i;
				}
				if (cnt == 6) {
					sixth = i;
				}
				cnt += 1;
			}
			i += 1;
		}
		System.out.println(sixth - fourth);
	}
}

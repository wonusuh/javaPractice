package 기타문법;

// 삼항연산자(미니if-else문) 조건 ? 참 : 거짓
public class _03삼항연산자 {
	public static void main(String[] args) {
		int a = 10;
		int b = 0;

		if (a == 10) {
			b = 1;
		} else {
			b = -1;
		}
		System.out.println(b);
		b = 0;

		b = a == 10 ? 1 : -1; // a 가 10이면 b에 1 할당 그렇지 않으면
		System.out.println(b);

		System.out.println(b % 2 != 0 ? "홀" : "짝");
	}
}

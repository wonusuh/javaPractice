package 반복문1개념;

// 반복문(되돌아가기)
public class _01반복문 {
	public static void main(String[] args) {
		// 1에서부터 5를 출력해라

		// 필수조건들 : 초기값, 조건식, 증감식

		int i = 1; // 초기화
		while (i <= 5) { // 조건식
			System.out.println(i);
			i += 1; // 증감식
		}
		System.out.println("=====");
		System.out.println(i);

		// 조건이 true인 동안 무한루프
		while (true) {
			System.out.println("-----");
		}
	}
}

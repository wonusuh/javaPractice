package 기초3개념;

// 위 -> 아래, 왼쪽 -> 오른쪽
// 으선순위 먼저 실행된다
// 1. 소괄호  () 어떤 연산자든 소괄호 안에 있으면 우선 실행
// 2. 산술연산자 */%
// 3. 산술연산자 +-
// 4. 비교연산자 > < >= <= == !=
// 5. 논리연산자 && || !
// 6. 대입연산자 =
public class _10연산자총정리 {
	public static void main(String[] args) {
		int x = 10;
		int y = 3;
		boolean result = (x + y > 3) || ((y + 5) * 7 < 35);
		System.out.println(result);
	}
}

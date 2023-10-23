package 기타문법;

// 구조
//	1) do{} => 조건과 상관없이 일단 실행되는 부분
//	2) while(조건); => 세미콜론 반드시 필수, 옆에 있는 조건식이 사실이면 다시 do {} 실행
public class _04do_while {
	public static void main(String[] args) {
		int i = 10;

		while (i > 10) {
			System.out.println("while ");
			i += 1;
		}

		i = 0;

		// 조건식이 참이 아니더라도 한번은 반드시 실행하겠다.
		do {
			System.out.println("do - while ");
			i += 1;
		} while (i > 10);
	}
}

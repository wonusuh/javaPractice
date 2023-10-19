package 반복문1개념;
// 반복변수 i
// 누적변수 누적하면서 사용하는 변수 => 갯수, 총합 => 보통 초기값을 0으로 설정한다.
public class _01횟수가있는반복문 {
	public static void main(String[] args) {
//		문제1 1~4까지 출력
//		정답 1 ,2, 3,4
//		
//		문제2 4~1까지 거꾸로 출력
//		4 3 2 1
//		
//		문제3 1~4 짝수만 출력
//		정답 2 4
		int i = 1;
		while (i <= 4) {
			System.out.println(i);
			i += 1;
		}
		System.out.println("=====");

		i = 4;
		while (i >= 1) {
			System.out.println(i);
			i -= 1;
		}
		System.out.println("=====");

		i = 1;
		while (i <= 4) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
			i += 1;
		}
		System.out.println("=====");
	}
}

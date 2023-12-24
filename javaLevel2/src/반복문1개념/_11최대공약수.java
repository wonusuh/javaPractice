package 반복문1개념;

public class _11최대공약수 {
	public static void main(String[] args) {
//		문제
//			6과 8의 공약수를 모두 출력하시오
//			공약수란, 위 두 수의 공통인 약수를 의미한다
//			
//		예) 6의 약수는 1, 2, 3, 4이다
//			8의 약수는 1 2 4 8이다
//			
//			6과 8의 공약수는 1 2 이다
//			6과 8의 최대공약수는 2 이다
//			
//		정답
//			2

		int x = 6;
		int y = 8;

		int min = x;
		if (min > y) {
			min = y;
		}
		System.out.println("min == " + min);

		int i = 1;
		while (i <= x) {
			if (x % i == 0) {
				System.out.print(i + " ");
			}

			i += 1;
		}
		System.out.println();
		i = 1;
		while (i <= y) {

			if (y % i == 0) {
				System.out.print(i + " ");
			}

			i += 1;
		}
		System.out.println();

		i = 1;
		int answer = 0;
		while (i <= min) {

			if (x % i == 0 && y % i == 0) {
				answer = i;
			}

			i += 1;
		}
		System.out.println();
		System.out.println("최대공약수 : "+answer);
	}
}

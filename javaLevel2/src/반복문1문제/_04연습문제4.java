package 반복문1문제;

public class _04연습문제4 {
	public static void main(String[] args) {
//		1~15를 출력한다
//		5보다크고 10보다 작으면서 3의 배수일때는 숫자대신 안녕을 출력한다
//		그 외는 전부 숫자를 출력한다
		int i = 1;
		while (i <= 15) {
			if (i > 5 && i < 10 && i % 3 == 0) {
				System.out.println("안녕");
			} else {
				System.out.println(i);
			}
			i += 1;
		}
	}
}

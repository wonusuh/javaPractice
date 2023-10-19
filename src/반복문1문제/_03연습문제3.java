package 반복문1문제;

public class _03연습문제3 {
	public static void main(String[] args) {
//		아래 조건을 충족하는 
//		조건1) 10~1 까지 거꾸롤 반복문을 실행한다
//		조건2) 3의 배수일 때는 안녕을 출력한다
//		조건3) 그 외에는 숫자를 출력한다
		int i = 10;
		while (i >= 1) {
			if (i % 3 == 0) {
				System.out.println("안녕");
			} else {
				System.out.println(i);
			}
			i -= 1;
		}
	}
}

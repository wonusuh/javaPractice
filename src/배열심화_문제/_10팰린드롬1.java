package 배열심화_문제;

public class _10팰린드롬1 {
	public static void main(String[] args) {
//		문제
//			아래 arr배열이 팰린드롬인지 아닌지 출력하시오
//			
//			팰린드롬이란?
//			앞에서부터 읽을 때와
//			뒤에서부터 읽을 떄 똑같은 숫자가 나오면 팰린드롬이다.
//			예) 2112
//			예) 12321
//		정답
//			팰린드롬이다.
		int[] arr = { 1, 5, 4, 5, 3, 2, 2, 3, 5, 4, 5, 1 };
		boolean check = true;

		for (int i = 0; i < arr.length; i += 1) {
			if (arr[i] == arr[(arr.length - 1) - i]) {
				System.out.print(i);
				System.out.println("같다");
			} else {
				System.out.print(i);
				System.out.println("같지않다");
				check = false;
				break;
			}
		}

		if (check) {
			System.out.println("팰린드롬이다.");
		} else {
			System.out.println("팰린드롬이 아니다.");
		}
	}
}

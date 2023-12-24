package 배열_개념;

public class _06인덱스연습 {
	public static void main(String[] args) {
//		문제
//			배열 b의 값들은 arr의 인덱스이다
//			arr 배열에서 b의 값들이 가르키는 인덱스의 값을 출력하시오
//		정답
//			20, 50, 10
		int[] arr = { 10, 20, 30, 40, 50 };
		int[] b = { 1, 4, 0 }; // arr 의 인덱스(방번호) 저장
		for (int i = 0; i < b.length; i += 1) {
			System.out.print(arr[b[i]] + " ");
		}
	}
}

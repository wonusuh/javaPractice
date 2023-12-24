package 배열2_문제;

public class _17일등 {
	public static void main(String[] args) {
//		문제
//			아래 데이터는 학생번호 1개, 점수 2개가 한 세트이다
//			번호는 1001부터 시작이고, 점수는 0~100이다
//			성적은 두 점수의 합으로 계산하며,
//			1등학생의 번호를 출력하시오
//		정답
//			1002
		int[] arr = { 1001, 20, 30, 1002, 43, 23, 1003, 45, 1 };
		int idx = -1;
		int max = 0;

		for (int i = 0; i < arr.length; i += 3) {
			if (arr[i + 1] + arr[i + 2] > max) {
				max = arr[i + 1] + arr[i + 2];
				idx = i;
			}
		}
		System.out.println(arr[idx]);
	}
}

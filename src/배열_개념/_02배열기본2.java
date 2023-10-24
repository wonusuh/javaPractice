package 배열_개념;

public class _02배열기본2 {
	public static void main(String[] args) {
		// 배열사용법1 => 처음에 배열의 길이를 모를 때
		int[] array = null;
		int cnt = 5;
		array = new int[cnt];
		System.out.println(array);

		// 배열사용법2 => 길이를 처음부터 알 때
		int[] arr = new int[5];
		System.out.println(arr);

		// 배열사용법3 => 길이와 안의 내용값까지 다 알 때 : 배열축약
		int[] temp = { 10, 20, 30, 40, 50 };
		System.out.println(temp);
	}
}

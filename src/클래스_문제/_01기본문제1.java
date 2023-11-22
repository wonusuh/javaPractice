package 클래스_문제;

class Test01 {
	int[] arr = { 87, 100, 11, 72, 92 };
}

public class _01기본문제1 {

	public static void main(String[] args) {

		Test01 t1 = new Test01();
		int sum = 0;
		int fourSum = 0;
		int fourCnt = 0;

		for (int i = 0; i < t1.arr.length; i += 1) {
			sum += t1.arr[i];

			if (t1.arr[i] % 4 == 0) {
				fourSum += t1.arr[i];
				fourCnt += 1;
			}
		}

//		문제1 전체 합 출력
//		정답1 362
		System.out.println("sum " + sum);

//		문제2 4의 배수의 합 출력
//		정답2 264
		System.out.println("fourSum " + fourSum);

//		문제3 4의 배수의 개수 출력
//		정답3 3
		System.out.println("fourCnt " + fourCnt);
	}
}

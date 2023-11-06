package _level4test;

public class 문제2 {
	public static void main(String[] args) {
//		[문제] 성적 순으로 번호를 출력하시오.
//		[정답] 1004, 1001, 1002, 1003
		int[] numList = { 1001, 1002, 1003, 1004 };
		int[] scoreList = { 87, 42, 11, 98 };

		for (int i = 0; i < scoreList.length; i += 1) {

			int max = 0;
			int maxIdx = -1;

			for (int k = 0; k < scoreList.length; k += 1) {

				if (scoreList[k] > max) {
					max = scoreList[k];
					maxIdx = k;
				}
			}
			scoreList[maxIdx] = 0;
			System.out.println(numList[maxIdx]);
		}
	}
}

package 배열1_문제;

public class _17학생성적3 {
	public static void main(String[] args) {
//		문제
//			1등학생의 학번과 성적을 출력하세요
//		정답
//			1004(98점)
		int[] numberList = { 1001, 1002, 1003, 1004, 1005 };
		int[] scoreList = { 87, 11, 45, 98, 23 };
		int max = 0;
		int first = -1;

		for (int i = 1; i < scoreList.length; i += 1) {
			if (max < scoreList[i]) {
				max = scoreList[i];
				first = i;
			}
		}
		System.out.println(numberList[first] + "번" + max + "점");
	}
}

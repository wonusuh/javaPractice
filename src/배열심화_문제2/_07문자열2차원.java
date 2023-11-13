package 배열심화_문제2;

import java.util.Arrays;

public class _07문자열2차원 {
	public static void main(String[] args) {
//		문제
//			userData는 회원번호의 이름이다.
//			pointData는 포인트점수와 회원번호이다.
//			번호가 여러개면 누적할 수 있다.
//			점수가 가장 높은 회원의 이름을 출력하시오.
//		정답
//			1002회원 이만수 3점
//		String userData = "1001/김철수\n";
//		userData += "1002/이만수\n";
//		userData += "1003/이영희";

		String pointData = "1,1001";
		pointData += "1,1002";
		pointData += "2,1003";
		pointData += "1,1001";
		pointData += "2,1002";

		int[] bunho = { 1001, 1002, 1003 };
		String[] name = { "김철수", "이만수", "이영희" };
		int[] point = new int[3];

		for (int i = 0; i < pointData.length(); i += 6) {

			int val = Integer.parseInt(pointData.substring(i + 2, i + 6));

			for (int j = 0; j < point.length; j += 1) {

				if (val == bunho[j]) {
					System.out.println(pointData.substring(i + 2, i + 6));
					System.out.println(Integer.parseInt(pointData.substring(i, i + 1)));
					point[j] += Integer.parseInt(pointData.substring(i, i + 1));
					System.out.println(Arrays.toString(point));
					break;
				}
			}
		}

		// 최대값 구하기
		int max = 0;
		int idx = -1;

		for (int i = 0; i < point.length; i += 1) {

			if (max < point[i]) {
				max = point[i];
				idx = i;
			}
		}
//		System.out.println(userData);
//		System.out.println(pointData);
		System.out.printf("%s회원 %s %d점", bunho[idx], name[idx], point[idx]);
	}
}

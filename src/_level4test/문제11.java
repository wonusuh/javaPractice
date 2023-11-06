package _level4test;

import java.util.Arrays;

public class 문제11 {
	public static void main(String[] args) {
//		아래 와 같은데이터일때 도서 연체여부 출력(단, 윤년은 계산하지않는다)
//	    [정답]   빌린지 12일 연체일이 2일 경과 되었습니다.
		int rentalPeriod = 10;
		int[] rentalDay = { 2023, 10, 25 };
		int[] today = { 2023, 11, 06 };

		int monthList[] = { 31, 28, 31, 30, 31, 31, 30, 31, 30, 31, 30, 31 };

		int[] temp = { rentalDay[0], rentalDay[1], rentalDay[2] };

		int cnt = 0;

		while (true) {
			cnt += 1;
			temp[2] += 1;

			if (temp[2] > monthList[temp[1] - 1]) {
				temp[2] = 1;
				temp[1] += 1;
			}

			if (temp[1] > 12) {
				temp[1] = 1;
				temp[0] += 1;
			}
			System.out.println(Arrays.toString(temp));

			if (temp[0] == today[0] && temp[1] == today[1] && temp[2] == today[2]) {
				break;
			}
		}
		System.out.printf("빌린지 %d일 연체일이 %d일 경과됐습니다.", cnt, cnt - rentalPeriod);
	}
}

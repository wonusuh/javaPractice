package 배열심화_문제;

public class _04기념일 {
	public static void main(String[] args) {
//		문제
//			철수와 영희는 3월 3일에 만났다.
//			철수는 영희와 100일 기념일에 축하파티를 하려고한다.
//			만난지 100일 은 몇월 몇일인지 구하시오.
//			단, 윤년은 고려하지 않는다.
//		정답
//			6월 11일
		int[] monthList = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		int month = 3;
		int day = 3;
		int dayCount = 100;
		int total = 0; // 1월달부터 day를 세서 빼주는 작업

		for (int i = 0; i < month - 1; i += 1) { // 0 1 => 1월달 2월달
			total += monthList[i];
		}

		total += day; // 1월부터 3월 3일까지의 값
		total += dayCount; // 1월부터 3월3일 + 100일 추가한것

		int temp = total;
		int dMonth = 0;
		int dDay = 0;
//		System.out.println(temp);
		for (int i = 0; i < monthList.length; i += 1) {
			temp -= monthList[i];
			dMonth += 1;
			if (temp < monthList[i]) {
				break;
			}
		}

		dMonth += 1; // 0월이 없기떄문에 +1 해준것
		dDay = temp;
		System.out.printf("%d월 %d일 \n", dMonth, dDay);

//		while (true) {
//			if (dayCount == 0) {
//				break;
//			}
//			day += 1;
//
//			if (monthList[month - 1] == day) { // 3월달의 마지막 날이면
//				day = 0;
//				month += 1;
//			}
//
//			dayCount -= 1;
//		}
//		
		System.out.printf("%d월 %d일 \n", month, day);
	}
}

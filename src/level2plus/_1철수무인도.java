package level2plus;

public class _1철수무인도 {
	public static void main(String[] args) {
//		철수는 무인도를 사들여 국왕이 되었다.
//		철수는 평소 월요일을 싫어해서 주7일을 주6일로 바꾸고 월요일을 삭제했다.
//		5월1일이 일요일이라고할때, 
//		5월1일부터 5월31일까지 날짜와 요일을 전부 출력해보자.
//		 [예시]
//		 	1 => 일
//		 	2 => 화
//		 	3 => 수
//		 	4 => 목
//		 	5 => 금
//		 	6 => 토
//		 	7 => 일
//		 	8 => 화
		String day = null;
		for (int i = 1; i <= 31; i += 1) {
			if (i % 6 == 0) {
				day = "토";
			} else if (i % 6 == 1) {
				day = "일";
			} else if (i % 6 == 2) {
				day = "화";
			} else if (i % 6 == 3) {
				day = "수";
			} else if (i % 6 == 4) {
				day = "목";
			} else {
				day = "금";
			}
			System.out.println(i + " => " + day);
		}
	}
}

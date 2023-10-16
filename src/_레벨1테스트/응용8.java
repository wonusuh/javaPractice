package _레벨1테스트;

import java.util.Random;

public class 응용8 {
	public static void main(String[] args) {
//		[문제 8]
//				이번달 1일이 수요일이라고 할 때
//				랜덤으로 1 ~ 31을 저장하고 해당 요일을 출력하시오.
//				
//				예)
//					3일  ==> 금요일
//				
//					월	화	수	목	금	토	일
//					     	 1   2	 3 	 4 	 5
//					 6   7	 8	 9	10	11	12
//					13	14	15	16	17	18	19
//					20	21	22	23	24	25	26
//					27	28	29	30	31

		Random rn = new Random();
		int date = rn.nextInt(31 - 1 + 1) + 1;
		System.out.println("date : " + date);
		String day = null;

		// dayFind8 -7 = 1 => 수요일
		// dayFind9 -7 = 2 => 목요일
		// dayFind10 -7 = 3 => 금요일
		// dayFind11 -7 = 4 => 토요일
		// dayFind12 -7 = 5 => 일요일
		// dayFind13 -7 = 6 => 월요일
		// dayFind14 -7 = 7 => 화요일

		int divide = (date + 0) % 7;
		if (divide == 0) {
			day = "화";
		} else if (divide == 1) {
			day = "수";
		} else if (divide == 2) {
			day = "목";
		} else if (divide == 3) {
			day = "금";
		} else if (divide == 4) {
			day = "토";
		} else if (divide == 5) {
			day = "일";
		} else if (divide == 6) {
			day = "월";
		}
		System.out.println("divided : " + divide);

		System.out.println("요일 : " + day);
	}
}

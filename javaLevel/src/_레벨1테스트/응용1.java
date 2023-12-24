package _레벨1테스트;

public class 응용1 {
	public static void main(String[] args) {
//		[문제 1]
//				철수는 일정한 빠르기로 운동장을 5바퀴 도는데 1시간 15분 20초가 걸렸다.
//				7바퀴를 도는데는 얼마나 걸릴지 구하시오.
//				(시간 분 초로 표현)
//			[정답]
//				1시간 45분 28초

		// 거리 = 속 * 시
		int fiveTimes = (75 * 60) + 20;
		System.out.println("다섯바퀴초 : " + fiveTimes);
		int oneTime = fiveTimes / 5;

		int sevenTimes = oneTime * 7;
		System.out.println("일곱바퀴초 : " + sevenTimes + "초");

		// 시간, 분, 초 로 변환
		int hour = sevenTimes / 3600;
		System.out.println(hour);

		int min = (sevenTimes % 3600 / 60);
		System.out.println(min);

		int sec = (sevenTimes % 60);
		System.out.println(sec);

		System.out.println(hour + "시간 " + min + "분 " + sec + "초");
	}
}

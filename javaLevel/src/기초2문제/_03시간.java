package 기초2문제;

/*
개념
시간 계산
1시간 = 60분 = 60*60(3600) 
1분 = 60초 

		[문제1] %
		4000초를 시간만 출력하시오.		  
		4000초를 시간을 제외하고 분만 출력하시오.
		4000초를 시간을 제외하고 초만 출력하시오.
*/
/*
[문제2]
	123123초를 시간만 출력하시오.		  
	123123초를 시간을 제외하고 분만 출력하시오.
	123123초를 시간을 제외하고 초만 출력하시오.
*/
public class _03시간 {
	public static void main(String[] args) {
		int total = 4000;
		int hour = total / 3600; // 400
		int min = total % 3600 / 60;
		int sec = total % 60;
		System.out.println("문제1");
		System.out.println("시 = " + hour);
		System.out.println("분 = " + min);
		System.out.println("초 = " + sec);

		// 123123 시간만
		// 123123 시간을 제외하고 분만
		// 123123 시간 분을 제외하고 초만
		total = 123123;
		hour = total / 3600;
		min = total % 3600 / 60;
		sec = total % 60;
		System.out.println("문제2");
		System.out.println("시 = " + hour);
		System.out.println("분 = " + min);
		System.out.println("초 = " + sec);
	}
}

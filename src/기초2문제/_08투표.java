package 기초2문제;

/*
[문제]
	철수네 반은 학생이 40명이다.
	철수, 영희, 민수는 반장선거에 나갔다.
	민수는 전체 중 40%를 획득했고,
	영희는 9표를 획득했다.
	나머지는 철수가 득표했다.
	철수,영희, 민수는 각각 몇 표를 득표했고,
	철수, 영희, 민수는 각각 전체 득표에서 몇 %를 획득했는지 구하시오.
	소수점 두 자리까지 출력하시오.
[정답]
	민수 40.0% 16.0표
	영희 22.5% 9.0표
	철수 37.5% 15.0표
*/
public class _08투표 {
	public static void main(String[] args) {
		// 전체가 100%라면 1%는 몇 명인가?
		// => 40명 : 100% = 1명 : n%
		// 40n = 100
		// n = 100/40
//		40명 = 100%
//		1명 = 100.0/40;
//		1명 = 2.5%
		double total = 40.0;
		double 한표당percent = 100 / total;

		// 2.5% : 1명 = 40% : n
		// 2.5n = 40
		// n =40/2.5
		double msPercent = 40;
		double msVote = msPercent / 한표당percent;
		System.out.printf("민수 득표율 = %.4f%%, 민수 득표수 = %.4f표\n", msPercent, msVote);

		// 9표 : 40표 = n% : 100%
		// 40n = 900
		// n = 900/40
		double yhVote = 9;
		double yhPercent = yhVote * 한표당percent;
		System.out.printf("영희 득표율 = %.4f%%, 영희 득표수 = %.4f표\n", yhPercent, yhVote);

		//
		double csPercent = 100 - yhPercent - msPercent;
		double csVote = total - yhVote - msVote;
		System.out.printf("철수 득표율 = %.4f%%, 철수 득표수 = %.4f\n", csPercent, csVote);
	}
}

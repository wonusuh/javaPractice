package _기초연습예제1;

public class A2_봉사활동여학생 {
	public static void main(String[] args) {

//		[문제]
//			철수네 반 학생은 30명입니다.
//			남학생은 15명, 여학생은 15명입니다.
//			이 중에서 남학생은 3명, 여학생은 남학생의 3배의 학생이 봉사활동을 하였습니다.
//			봉사활동을 하지 않은 여학생은 몇 명인지 구하시오.
//		[정답]
//			6명
//	*/
		int total = 30;
		int boys = 15;
		int girls = total - boys;

		int serviceBoys = 3;
		int serviceGirls = serviceBoys * 3;
		System.out.println(girls - serviceGirls + "명");

	}
}

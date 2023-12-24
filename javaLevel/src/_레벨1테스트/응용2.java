package _레벨1테스트;

public class 응용2 {
	public static void main(String[] args) {
//		[문제 2]
//				철수네 반 학생은 16명이다.
//				8명은 양로원에 봉사활동을 다녀왔고
//				4명은 지하철 봉사활동을 다녀왔다.
//				봉사활동을 다녀오지 않은 학생의 비율은 몇% 인지 구하시오.
//			[정답]
//				25%
		double total = 16;
		double remain = 16 - 8 - 4;
		System.out.println("remain : " + remain);

		// 안간인원 / 전체인원 *100
		double rate = (remain / total) * 100; // 100분욜 이므로 100을 곱해준다
		System.out.println(rate + "%");
	}
}

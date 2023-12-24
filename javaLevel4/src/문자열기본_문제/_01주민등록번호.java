package 문자열기본_문제;

public class _01주민등록번호 {
	public static void main(String[] args) {
		// 주번 1과 주번 2의 각각 만 나이와 성별을 출력하시오
		String jumin1 = "890101-2012932";
		// 문제 1 정답) 여성 34세

		String jumin2 = "020101-3012932";
		// 문제 2 정답) 남성 21세

		String[] jumin = { jumin1, jumin2 };

//		System.out.println(Integer.parseInt((String) jumin[0].subSequence(0, 2)));

		for (int i = 0; i < jumin.length; i += 1) {
			if ((Integer.parseInt((String) jumin[i].subSequence(0, 2))) > 23) {
				System.out.print(123 - (Integer.parseInt((String) jumin[i].subSequence(0, 2))) + "세");
				if (jumin[i].charAt(7) == '1') {
					System.out.println(" 남성");
				} else {
					System.out.println(" 여성");
				}
			} else {
				System.out.print(23 - (Integer.parseInt((String) jumin[i].subSequence(0, 2))) + "세");
				if (jumin[i].charAt(7) == '3') {
					System.out.println(" 남성");
				} else {
					System.out.println(" 여성");
				}
			}
		}
	}
}

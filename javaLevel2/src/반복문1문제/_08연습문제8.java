package 반복문1문제;

public class _08연습문제8 {
	public static void main(String[] args) {
//		문제
//		1에서 200사이의 숫자중 다음 조건에 맞는 숫자를 출력하세요
//		조건) 6의배수 중에서 100에 가장 가까운 수를 출력하세요
//		정답
//		102
		int i = 1;
		int answer = 0;
		int limit = 100;

		while (i <= 200) {
			if (i % 6 == 0 && i <= limit) {
				answer = i;
				int nextNum = answer + 6;
				if (100 - answer > nextNum - 100) {
					answer = nextNum;
				}
			}
			i += 1;
		}
		System.out.println(answer);
//		// 둘 즁에 100에 더 가까운 수 찾기
//		int a = 96;
//		int b = 102;
//		int aResult = 100 - a;
//		int bResult = 100 - b;
//		if (aResult < 0) {
//			aResult *= -1;
//			System.out.println("aResult : " + aResult);
//		}
//		if (bResult < 0) {
//			bResult *= -1;
//			System.out.println("cResult : " + bResult);
//		}
//		if(aResult<bResult) {
//			System.out.println("a가 100에 더 가깝다.");
//		} else {
//			System.out.println("c가 100에 더 가깝다");
//		}
	}
}

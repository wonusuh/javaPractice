package 반복문2문제;

public class _17수영장 {
	public static void main(String[] args) {
//		문제
//			철수와 민수는 같은 수영장에 다닌다
//			철수느 4 일마다 한번씩 가고 민수는 5일마다 한번씩 간다
//			
//			철수와 민수가 24년 2월 3일에 처음 만났다면
//			다음에 서로 만나는 날은 언제인지 구하시오
//		정답
//			2024년 2월 23일
		int cs = 4;
		int ms = 5;
		int answer = 0;
		int i = 1;

		while (true) {
			if (i % cs == 0 && i % ms == 0) {
				answer = i;
				break;
			}
			i += 1;
		}
		System.out.println(answer + 3);
	}
}

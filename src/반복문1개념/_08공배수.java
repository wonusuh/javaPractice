package 반복문1개념;

public class _08공배수 {
	public static void main(String[] args) {
//		/*
//		공배수
//		공통배수
//		12로도 나누어떨어지고 15로도 나누어 떨어지는 수 = > 공배수
//		
//		문제
//			12와 15의 공배수르 작언것부터 5개 출력하하라
//		정답
//			60, 120, 180, 240, 300
//		*/
		int i = 1;
		int cnt = 0;

		boolean run = true;
		while (run) {
			if (i % 12 == 0 && i % 15 == 0) {
				cnt += 1;
				if (cnt != 5) {
					System.out.print(i + ", ");
				} else {
					System.out.println(i);
				}
				if (cnt == 5) {
					run = false;
				}
			}
			// System.out.printf("i == %d, cnt ==%d\n", i, cnt);
			i += 1;
		}
	}
}

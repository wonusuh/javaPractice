package 배열심화_문제2;

import java.util.Arrays;

public class _10채팅 {

	public static void main(String[] args) {
//문제
//	다음은 철수와 영희의 채팅 내용이다.
//	철수는 왼쪽 정렬, 영희는 오른쪽 정렬로 출력하시오.
//	대화의 한 줄 길이는 20칸이다.
//정답
//	영희야 안녕
//					철수야 안녕
//	오늘 점심같이 먹을래?
//					아니 약속있어.
//					다음에 먹자.
//	그래 다음에 먹자.
		// String format 없이 문제 풀기
		String[][] wordList = {

				{ "철수", "영희야 안녕" },

				{ "영희", "철수야 안녕" },

				{ "철수", "오늘 점심같이 먹을래?" },

				{ "영희", "아니 약속있어." },

				{ "영희", "다음에 먹자." },

				{ "철수", "그래 다음에 먹자." } };
		int space = 20;

		for (int i = 0; i < wordList.length; i += 1) {

			for (int j = 0; j < wordList[i].length; j += 2) {

				char[] temp = new char[space];

				if (wordList[i][0].equals("철수")) {

					for (int k = 0; k < wordList[i][1].length(); k += 1) {
						temp[k] = wordList[i][1].charAt(k);
					}
				} else {

					for (int k = 0; k < wordList[i][1].length(); k += 1) {
						temp[temp.length - wordList[i][1].length() + k] = wordList[i][1].charAt(k);
					}
				}
				System.out.println(Arrays.toString(temp));
			}
		}
	}
}

package 배열심화_문제2;

public class _10채팅_정답 {

	public static void main(String[] args) {

		String[][] wordList = { { "철수", "영희야 안녕" }, { "영희", "철수야 안녕" }, { "철수", "오늘 점심같이 먹을래?" }, { "영희", "아니 약속있어." },
				{ "영희", "다음에 먹자." }, { "철수", "그래 다음에 먹자." } };

		int space = 20;
		for (int i = 0; i < wordList.length; i += 1) {
			char[] temp = new char[space];
			int size = wordList[i][1].length();
			for (int k = 0; k < size; k += 1) {
				if (wordList[i][0].equals("철수")) {
					temp[k] = wordList[i][1].charAt(k);
				} else {
					temp[space - 1 - k] = wordList[i][1].charAt(size - 1 - k);
				}
			}
			for (int k = 0; k < temp.length; k += 1) {
				System.out.print(temp[k]);
			}
			System.out.println();
		}
	}
}
